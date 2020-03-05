package com.company.lesson6;

import com.company.lesson6.inner.PrivateTransport;

public class Lesson6Main {
    public static void main(String[] args) {
        Car car1 = new Car(100, "ax1", true);
        Car car2 = new Car(100, "ax1", false);
        Car car3 = null;

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));


        System.out.println(car1);

    }
}
