package com.company.lesson11.rec;

public abstract class Product<T extends Product<T>> implements Comparable<T>{
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(T o) {
        int result = Integer.compare(price, o.getPrice());
        return result == 0 ? subCompareTo(o) : result;
    }

    protected abstract int subCompareTo(T p);


}
