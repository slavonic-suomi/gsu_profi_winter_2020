package com.company.lesson3;

public class Lab1 {
    public static void main(String[] args) {
        double x = 1, a = 2, b = 3, u = 11;
        double result;

        if (x < a) {
            if (x != 0) {
                double someVariable = x + u / (5 * x);
                result = Math.log(someVariable);
            } else {
                System.out.println("x = 0 !");
                return;
            }
        } else if (x >= a && x <= b) {
            result = Math.pow(Math.E, -x) / (x - 10 * u);
        } else {
            result = Math.tan(Math.PI * (x + u));
        }

        System.out.println(result);
    }
}
