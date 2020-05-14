package com.company.lesson15;

import java.util.concurrent.atomic.AtomicInteger;

public class CorrectRaceConditionMain {

//    private static volatile int count = 0;
    private static AtomicInteger ai = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int local = 0;
                for (int i = 0; i < 1_000_000_000; i++) {
                        local++;
                }
                ai.addAndGet(local);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int local = 0;
                for (int i = 0; i < 1_000_000_000; i++) {
                    local--;
                }
                ai.addAndGet(local);
            }
        });

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
//        System.out.println(count);
        System.out.println(ai.get());
    }
}
