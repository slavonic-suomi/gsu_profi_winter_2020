package com.company.lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MTMain {
    public static void main(String[] args) throws InterruptedException {
        int result1[] = new int[1];
        int result2[] = new int[1];

        List<Integer> list = new CopyOnWriteArrayList<>();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
//                result1[0] = calc(1);
                list.add(calc(1));
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
//                result2[0] = calc(1);
                list.add(calc(1));
            }
        };

        long start = System.currentTimeMillis();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println(list.get(0) + list.get(1));
        System.out.println(result1[0] + result2[0]);
        System.out.println("END!");
        System.out.println(end - start);
    }


    private static int calc(int input) {
        for (int i = 0; i < 1_000_000_000; i++) {
            input = input * input;
        }
        return input;
    }
}
