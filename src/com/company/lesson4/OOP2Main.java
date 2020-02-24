package com.company.lesson4;

public class OOP2Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.x = box.y = 5;
        box.size = 10;

        Rectangle rectangle = new Rectangle();
        rectangle.x = rectangle.y = 15;
        rectangle.sizeA = 10;
        rectangle.sizeB = 20;

        System.out.println(box.calculateSquare());
        System.out.println(rectangle.calculateSquare());

        Figure figure = new Rectangle();
        figure.x = rectangle.y = 15;

        System.out.println(figure.calculateSquare());
    }
}
