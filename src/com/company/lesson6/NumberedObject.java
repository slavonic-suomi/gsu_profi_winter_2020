package com.company.lesson6;

public interface NumberedObject extends Comparable<NumberedObject> {

    public static final int x = 123;

    String getNumber();
}
