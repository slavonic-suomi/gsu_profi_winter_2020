package com.company.lesson11.rec;

public class Phone extends Product<Phone> {

    private int size;

    public Phone(int price) {
        super(price);
    }

    @Override
    protected int subCompareTo(Phone p) {
        return Integer.compare(size, p.size);
    }
}
