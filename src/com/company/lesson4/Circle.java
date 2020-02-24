package com.company.lesson4;

public class Circle extends Figure {
    int radius;

    int calculateSquare() {
        return (int) (radius * radius * Math.PI);
    }
}
