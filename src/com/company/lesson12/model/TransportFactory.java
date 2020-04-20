package com.company.lesson12.model;

import com.company.lesson10.ScannerWrapper;
import com.company.lesson12.Factory;

public class TransportFactory implements Factory<AutoTransport> {

    private ScannerWrapper sc = new ScannerWrapper();

    public AutoTransport create() {
        System.out.println("1 - create Car");
        System.out.println("2 - create Truck");

        int choice = sc.nextInt(1, 2);

        AutoTransport result;
        if (choice == 1) {
            Car car = new Car();

            System.out.println("Input car power");
            int power = sc.nextInt();

            car.setPower(power);

            result =  car;
        } else {
            Truck truck = new Truck();

            System.out.println("Input truck weight");
            int weight = sc.nextInt();

            truck.setWeight(weight);


            result = truck;
        }

        System.out.println("Input transport number");
        String number = sc.nextLine();
        result.setNumber(number);

        System.out.println("Input transport price");
        int price = sc.nextInt();
        result.setPrice(price);


        return result;
    }
}
