package com.company.lesson12.model;


import java.util.Objects;

public class Car extends AutoTransport {
    private int power;

    public Car() {
    }

    public Car(String number, int power) {
        super(number);
        this.power = power;
    }

    public Car(String number, int price, int power) {
        super(number, price);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return power == car.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power);
    }
}
