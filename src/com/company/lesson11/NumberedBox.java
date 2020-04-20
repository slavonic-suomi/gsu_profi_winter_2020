package com.company.lesson11;

public class NumberedBox<T> extends Box<T> {

    public int number;

    public NumberedBox(T value) {
        super(value);
    }
}
