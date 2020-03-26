package com.company.lesson5;

import com.company.lesson5.Bus;
import com.company.lesson5.Engine;
import com.company.lesson5.Transport;

public class TransportMain {
    public static void main(String[] args) {
        Transport t1 = new Bus();

//        t1.number = "A134";
//        t1.passengers = -120;
        Engine engine = new Engine();
        Engine engine1 = engine;
        engine.setPower(555);
        engine.setRotationCount(555);

        t1.setEngine(engine);
//
//        int input = -123;
//        t1.setPassengers(input);
        t1.getEngine().setPower(0);

        int power = engine.getPower();
        int passengers = t1.getPassengers();

//        System.out.println(input);
        System.out.println(power);

        Bus.createBus(123, "asd");

    }
}
