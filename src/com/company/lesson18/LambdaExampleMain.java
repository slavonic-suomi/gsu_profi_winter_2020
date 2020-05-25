package com.company.lesson18;

public class LambdaExampleMain {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello!");
            }
        };

        Runnable r2 = () -> {
            System.out.println("hello!");
        };

        Runnable r3 = () -> System.out.println("hello!");

        r1.run();
        r2.run();

        Sum s1 = new Sum() {
            @Override
            public int doSum(int a, int b) {
                return a + b;
            }
        };

        Sum s2 = (int a, int b) ->  { return a + b; };
        Sum s3 = (a, b) ->  a + b;
    }

    @FunctionalInterface
    private interface Sum {
        int doSum(int a, int b);

        default int doSum1(int a, int b) {
            return a + a + b + 1;
        }
    }
}
