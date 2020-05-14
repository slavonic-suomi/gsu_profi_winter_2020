package com.company.lesson15;

import java.util.Random;
import java.util.concurrent.*;

public class ExecutorsMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Callable<Integer> callable = new Callable<>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(300 + new Random().nextInt(500));
                int result = 1;
                for (int i = 0; i < 1_000_000_000; i++) {
                    result = result * result;
                }
                return result;
            }
        };


        Future<Integer> task1 = executorService.submit(callable);
        Future<Integer> task2 = executorService.submit(callable);
        Future<Integer> task3 = executorService.submit(callable);

        System.out.println("task1 done? " + task1.isDone());
        System.out.println("task2 done? " + task2.isDone());
        System.out.println("task3 done? " + task3.isDone());
        System.out.println("working...");

        Integer result = task1.get();
        System.out.println("task1 done? " + task1.isDone());
        System.out.println("task2 done? " + task2.isDone());
        System.out.println("task3 done? " + task3.isDone());
        System.out.println("working...");

        result = task2.get();

        System.out.println("task1 done? " + task1.isDone());
        System.out.println("task2 done? " + task2.isDone());
        System.out.println("task3 done? " + task3.isDone());
        System.out.println("working...");

        result = task3.get();

        System.out.println("task1 done? " + task1.isDone());
        System.out.println("task2 done? " + task1.isDone());
        System.out.println("task3 done? " + task1.isDone());
        System.out.println("working...");

        System.out.println(result);

        executorService.shutdown();

    }
}
