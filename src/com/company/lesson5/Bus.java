package com.company.lesson5;

import java.util.Random;

public class Bus extends Transport {
    int fuelAmount;

    public Bus() {
    }

    public Bus(int routeNumber, String number, boolean hasPandus, Engine engine, int passengers, int fuelAmount) {
        super(routeNumber, number, hasPandus, engine, passengers);
        this.fuelAmount = fuelAmount;
    }

    public static Bus createBus(int routeNumber, String number) {
        int pass = 123;
        if (new Random().nextInt() % 2 == 0) {
            pass = 456;
        }
        return new Bus(routeNumber, number, false, null, pass, 0);
    }
}
