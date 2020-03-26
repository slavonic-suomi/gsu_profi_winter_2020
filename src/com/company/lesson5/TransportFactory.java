package com.company.lesson5;

import java.util.Scanner;

public class TransportFactory {

    private Scanner sc = new Scanner(System.in);

    public Transport createTransport() {
        System.out.println("input (1) to Bus");
        System.out.println("input (2) to Trolley");

        int select = sc.nextInt();
        if (select == 1) {
            return createBus();
        } else if (select == 2) {
            return createTrolley();
        } else {
            return null;
        }
    }

    private Transport createTrolley() {
        return null;
    }

    private Bus createBus() {
        return null;
    }
}
