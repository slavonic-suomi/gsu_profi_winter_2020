package com.company.lesson3;

import java.util.Arrays;

public class Lab2 {
    public static void main(String[] args) {
        int[] simpleArray = {1,2,3,5};
        int[][] array = { {1,2,3}, {4,5,6}, {7,8,9} };


//        1 2 3
//        4 5 6
//        7 8 9
        int max = array[0][0], maxI = 0, maxJ = 0;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > max) {
                    max = array[i][j] ;
                    maxI = i; maxJ = j;
                }
            }
        }
        int[] result = new int[array.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[maxI][i] * array[i][maxJ];
        }

        System.out.println(max);
        System.out.println(Arrays.toString(result));
    }
}
