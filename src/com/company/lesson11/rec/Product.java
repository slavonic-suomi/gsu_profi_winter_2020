package com.company.lesson11.rec;

public class Product<E extends Product<E>> implements Comparable<E>{
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(E o) {
        return Integer.compare(price, o.getPrice());
    }
}
