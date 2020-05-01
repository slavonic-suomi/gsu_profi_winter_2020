package com.company.lesson10;

import java.util.Objects;

public class Truck extends AutoTransport {

    private int weight;

    public Truck() {
    }

    public Truck(String number, int weight) {
        super(number);
        this.weight = weight;
    }

    public Truck(String number, int price, int weight) {
        super(number, price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                "} " + super.toString();
    }

    public String toProtocolString() {
        return "t|" + weight + "|" + super.toProtocolString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return weight == truck.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }
}
