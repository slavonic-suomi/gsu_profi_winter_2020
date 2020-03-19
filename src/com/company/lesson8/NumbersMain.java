package com.company.lesson8;

public class NumbersMain {
    public static void main(String[] args) {
        int i = 1;
        Integer i1 = null;

//        int i2 = i1;
//        test(i1);

        byte b = 1;
        Byte b1 = 1;

        Integer integer = Integer.valueOf("10");
        System.out.println(integer.toString());
    }

    public static int test(int i) {
        return i * 2;
    }
}
