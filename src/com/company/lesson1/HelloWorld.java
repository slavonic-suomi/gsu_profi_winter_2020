package com.company.lesson1;

public class HelloWorld {

    public static void main(String[] args) {

        byte someVar;
        char c = 49;
        short s = 49;
        int i = 1;
        long l = 5_000_000_000L;

        someVar = 127;
        someVar = (byte) (someVar / i);

        System.out.println(s);
        System.out.println(c);

        float f = -0f;
        double d = 0;

        System.out.println(d / f);

        boolean b1 = true;
        boolean b2 = false;
        if (i > 0) {
            System.out.println(s / i);
        } else if(i < 0) {
            System.out.println("%(");
        } else {
            System.out.println("i = 0");
        }

        double sin = Math.sin(123);

    }
}
