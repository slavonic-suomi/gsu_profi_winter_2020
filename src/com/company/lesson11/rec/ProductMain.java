package com.company.lesson11.rec;

import com.company.lesson11.Box;

import java.util.*;

public class ProductMain {

    public static void main(String[] args) {
        Phone phone3 = new Phone(3);
        Phone phone2 = new Phone(2);
        Computer computer = new Computer(0);

        List<Phone> products = List.of(
                phone2,
                new Phone(0),
                phone3
        );

        products = new ArrayList<>(products);

        Collections.sort(products);

    }
}
