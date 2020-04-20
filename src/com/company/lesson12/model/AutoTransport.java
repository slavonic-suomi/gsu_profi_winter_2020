package com.company.lesson12.model;

import java.util.Objects;

public class AutoTransport implements Comparable<AutoTransport>{

    private String number;
    private int price;


    @Override
    public int compareTo(AutoTransport o) {
        if (price > o.getPrice()) {
            return 1;
        }
        if (price < o.getPrice()) {
            return -1;
        }
        return 0;
    }

    public AutoTransport() {
    }

    public AutoTransport(String number) {
        this.number = number;
    }

    public AutoTransport(String number, int price) {
        this.number = number;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AutoTransport that = (AutoTransport) o;
        return price == that.price &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, price);
    }

    @Override
    public String toString() {
        return "AutoTransport{" +
                "number='" + number + '\'' +
                ", price=" + price +
                '}';
    }

}
