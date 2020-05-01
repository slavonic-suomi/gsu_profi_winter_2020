package com.company.lesson14;

import com.company.lesson10.AutoTransport;
import com.company.lesson10.Car;
import com.company.lesson10.Truck;

public class SerializationMain {
    public static void main(String[] args) {
//        Car car = new Car("asd", 123, 456);
//        Truck truck = new Truck("qwe", 456, 457);
//
//        System.out.println(car.toProtocolString());
//        System.out.println(truck.toProtocolString());

        String s1 = "c|456|asd|123";
        String s2 = "t|457|qwe|456";

        AutoTransport t1 = parse(s1);
        AutoTransport t2 = parse(s2);

        System.out.println(t1);
        System.out.println(t2);
    }

    public static AutoTransport parse(String s) {
        String[] string = s.split("\\|");
        if ("c".equals(string[0])) {
            Car car = new Car();
            car.setPower(Integer.parseInt(string[1]));
            car.setNumber(string[2]);
            car.setPrice(Integer.parseInt(string[3]));

            return car;
        } else {
            Truck truck = new Truck();
            truck.setWeight(Integer.parseInt(string[1]));
            truck.setNumber(string[2]);
            truck.setPrice(Integer.parseInt(string[3]));

            return truck;
        }
    }
}
