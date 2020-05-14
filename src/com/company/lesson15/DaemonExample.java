package com.company.lesson15;

public class DaemonExample {
    public static void main(String[] args) throws InterruptedException {

        Thread daemonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = 0;
                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("already working " + (++count) + " sec");
                }
            }
        });

        daemonThread.setDaemon(true);
        daemonThread.start();

        Thread.sleep(3500);
        System.out.println("Main finish");

    }
}
