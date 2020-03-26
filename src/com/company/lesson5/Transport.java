package com.company.lesson5;

public abstract class Transport {
    private int routeNumber;

    private String number;
    boolean hasPandus;

    private Engine engine;

    private int passengers;

    public Transport() {
    }

    public Transport(int routeNumber, String number, boolean hasPandus, Engine engine, int passengers) {
        this.routeNumber = routeNumber;
        this.number = number;
        this.hasPandus = hasPandus;
        this.engine = engine;
        this.passengers = passengers;
    }

    public int getPassengers() {
        return this.passengers;
    }

    public void setPassengers(int passengersCount) {
        if (passengersCount < 0) {
            passengersCount = 0;
            System.out.println("Wrong passengersCount!");
        } else {
            this.passengers = passengersCount;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
//        Engine newEng = new Engine();
//        newEng.setPower(600);
//        engine = newEng;
    }
}
