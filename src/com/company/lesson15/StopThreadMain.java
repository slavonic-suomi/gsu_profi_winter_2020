package com.company.lesson15;

public class StopThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inner thread start");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("inner thread end");

            }
        });

        t1.start();
        Thread.sleep(2000);

        t1.stop();
    }
}
