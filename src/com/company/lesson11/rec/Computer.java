package com.company.lesson11.rec;

public class Computer extends Product<Computer> {

    private int power;

    public Computer(int price) {
        super(price);
    }

    @Override
    protected int subCompareTo(Computer p) {
        return Integer.compare(power, p.power);
    }
}
