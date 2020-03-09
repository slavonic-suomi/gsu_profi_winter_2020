package com.company.lesson6;

import com.company.lesson6.inner.PrivateTransport;

import java.sql.Array;
import java.util.Arrays;

public class Lesson6Main {
    public static void main(String[] args) {
        Car car1 = new Car(100, "ax1", true);
        Car car2 = new Car(100, "ax1", false);
        Car car3 = null;

        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));


        System.out.println(car1);

        Color c1 = Color.GREEN;

        System.out.println(c1.ordinal());
        System.out.println(c1.getHexColor());
//        int value = 1;
//        for (Color color : Color.values()) {
//            if (color.ordinal() == value) {
//
//            }
//        }

        NumberedObject no1 = new Car(123, "123", false);
        NumberedObject no2 = new Car(123, "312", false);
        NumberedObject no3 = new Car(123, "564", false);
        NumberedObject no4 = new Car(123, "234", false);

        NumberedObject[] array = {no1, no2, no3, no4};

//        sort(array);

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(NumberedObject[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                String numberI = array[i].getNumber();
                String numberJ = array[j].getNumber();
                if (numberI.compareTo(numberJ) < 0) {
                    NumberedObject t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
    }
}
