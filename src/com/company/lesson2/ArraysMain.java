package com.company.lesson2;

import java.util.Scanner;

public class ArraysMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();

        System.out.println(arraySize);

        int[] array1;

        array1 = new int[arraySize];

        array1[0] = 234;

        int someVarFromArray = array1[0];

        System.out.println(someVarFromArray);
        System.out.println(array1[1]);


        int i = 0;
        while (i < array1.length) {
            array1[i] = i * 3;
            System.out.println(array1[i]);
            i = i + 1;
        }

        do {
            System.out.println("Once!");
        } while (false);


        int someVar = ++arraySize;
        System.out.println(someVar);

        for (int j = 0; j < array1.length; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.println("Many! " + j);
            if (j > 5) {
                break;
            }
        }

        int[][] array2 = new int[5][10];

        array2[4][4] = 34;

        /*
        boolean end = false;
        for(int i1 = 0; i1 < array2.length; i1++) {
            for(int i2 = 0; i2 < array2[i1].length; i2++) {
                array2[i1][i2] = i1 * i2;
                System.out.print(array2[i1][i2] + " ");

                if (i1 + i2 == 10) {
                    end = true;
                    break;
                }
            }
            if (end) {
                break;
            }
            System.out.println();
        }
        */
        m1: for(int i1 = 0; i1 < array2.length; i1++) {
            for(int i2 = 0; i2 < array2[i1].length; i2++) {
                array2[i1][i2] = i1 * i2;
                System.out.print(array2[i1][i2] + " ");

                if (i1 + i2 == 10) {
                    break m1;
                }
            }

            System.out.println();
        }

//        int z = i++ + ++i;
    }
}
