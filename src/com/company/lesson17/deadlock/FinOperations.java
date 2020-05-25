package com.company.lesson17.deadlock;

import java.util.Random;
import java.util.concurrent.TimeUnit;

//Java concurrency in practice

public class FinOperations {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account(100);
        Account b = new Account(10);

        Thread t1 = new Thread(() -> {
            try {
                safeTransfer(b, a, 10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    safeTransfer(a, b, 10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Account a: " + a.getAmount());
        System.out.println("Account b: " + b.getAmount());

    }

    public static void safeTransfer(Account from, Account to, int amount) throws Exception {
        System.out.println(Thread.currentThread().getName() + " start");

        if (from.getLock().tryLock(300, TimeUnit.MILLISECONDS)) {
            try {
                Random random = new Random();
                Thread.sleep(100 + random.nextInt(100));
                if (to.getLock().tryLock(600, TimeUnit.MILLISECONDS)) {
                    try {
                        from.withdraw(amount);
                        Thread.sleep(100 + random.nextInt(100));

                        to.deposit(amount);
                        System.out.println("transfer completed!");
                    } finally {
                        to.getLock().unlock();
                    }
                }
            } finally {
                from.getLock().unlock();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finish");
    }

    public static void deadLockTransfer(Account from, Account to, int amount) throws Exception {
        System.out.println(Thread.currentThread().getName() + " start");

        synchronized (from) {
            Random random = new Random();
            Thread.sleep(100 + random.nextInt(100));
            synchronized (to) {
                from.withdraw(amount);
                Thread.sleep(100 + random.nextInt(100));

                to.deposit(amount);
            }

        }
        System.out.println(Thread.currentThread().getName() + " finish");
    }
}
