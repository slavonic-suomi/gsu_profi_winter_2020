package com.company.lesson11;

import java.util.Arrays;

public class BoxMain {

    public int summ(int a, int b) {
        return a + b;
    }

    public long summ(long a, long b) {
        return a + b;
    }


    public static <L, R> Pair<L, R> buildPair(Box<L> b1, Box<R> b2) {
        return new Pair<>(b1.getValue(), b2.getValue());
    }

    public static void main(String[] args) {
        String stringInput = "qwe";

        Box<String> stringBox = new Box<String>(stringInput);
        Box<Integer> integerBox = new Box<Integer>(1);

        System.out.println(stringBox.stringHashCode());
        System.out.println(integerBox.stringHashCode());


        String value = stringBox.getValue();
        Integer intValue = integerBox.getValue();

       /* Box unknownBox = stringBox;
        unknownBox.setValue(12);

        Object unknownBoxValue = unknownBox.getValue();
        System.out.println(unknownBoxValue);

        String stringBoxValue = stringBox.getValue();*/

        Pair<String, Integer> stringIntegerPair = buildPair(stringBox, integerBox);
    }
}
