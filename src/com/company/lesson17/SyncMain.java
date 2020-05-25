package com.company.lesson17;

public class SyncMain {

    public static Object monitor = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    execute();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    execute();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }

    public synchronized static void execute() throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + " start");
            Thread.sleep(5_000);
            System.out.println(Thread.currentThread().getName() + " finish");
    }
}
