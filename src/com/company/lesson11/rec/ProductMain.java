package com.company.lesson11.rec;

import java.util.Arrays;
import java.util.Collection;

public class ProductMain {

    public static void main(String[] args) {
        Product<?>[] products = new Product<?>[2];
        products[0] = new Phone(1);
        products[1] = new Computer(1);


        Phone[] phones = new Phone[1];
        phones[0] = new Phone(2);

        Arrays.sort(phones);
        Arrays.sort(products);
    }

    public static void sortAndPrint(Collection<? extends Number> someCollection) {

    }
}
