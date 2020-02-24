package com.company.lesson4;

public abstract class Figure {
    int x;
    int y;

//    int calculateSquare() {
//        return 0;
//    }

    abstract int calculateSquare();

    void printCoordinates() {
        System.out.println("x = " + x + " y = " + y);
    }
}
