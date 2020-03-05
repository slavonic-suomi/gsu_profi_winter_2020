package com.company.lesson6;

import com.company.lesson6.inner.PrivateTransport;

public class Car extends PrivateTransport {

    private boolean isSportCar;

    public Car(int weight, String number, boolean isSportCar) {
        super(weight, number);
        this.isSportCar = isSportCar;
        System.out.println("car constr invocation");
    }

    public boolean isSportCar() {
        return isSportCar;
    }

    public void setSportCar(boolean sportCar) {
        isSportCar = sportCar;
    }

    public void drive() {
        System.out.println("i'm car");
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return this.isSportCar == ((Car) o).isSportCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "isSportCar=" + isSportCar + ", " +
                super.toString() +
                "} " ;
    }
}
