package com.company.lesson11;

import com.company.lesson10.AutoTransport;
import com.company.lesson10.Car;

import java.util.Arrays;

public class GenericSort {
    public static void main(String[] args) {
        AutoTransport[] transports = new AutoTransport[3];
        transports[0] = new Car("123", 1, 1);
        transports[1] = new Car("678", 3, 1);
        transports[2] = new Car("456", 2, 1);

        Arrays.sort(transports);

        System.out.println(Arrays.toString(transports));
    }
}
