package com.company.lesson4;

public class OOPMain {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Box b3 = new Box();

        Box[] boxArray = {b1, b2, b3};

        b1.x = 10;
        b1.y = 10;

        b2.x = 20;
        b2.y = 20;
        b2.size = 15;

        System.out.println(b2.size);
        System.out.println(b1.size);

        Rectangle r1 = new Rectangle();

        r1.sizeA = r1.sizeB = 10;

        Figure f1 = new Rectangle();
        f1.x = f1.y = 25;

        Figure[] fArray = {b1, b2, b3, r1, f1};

        for (int i = 0; i < fArray.length; i++) {
            fArray[i].x += 10;
        }

//        int b1Square = b1.size * b1.size;
        int b1Square = b1.calculateSquare();

        System.out.println(r1.calculateSquare());

        System.out.println(b1Square);

        b1.printCoordinates();
        r1.printCoordinates();
        f1.printCoordinates();



//        Figure f2 = new Figure();
    }
}
