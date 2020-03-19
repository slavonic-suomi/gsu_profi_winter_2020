package com.company.lesson7;

public class Lab4Example10 {
    public static void main(String[] args) {
        String input = "asd123gdfg4g5";
        char[] chars = input.toCharArray();

        int summ = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= '0' && c <= '9') {
//                Integer integer = Integer.valueOf("" + c);
                summ += c - '0';
            }
        }

        System.out.println(summ);
    }
}
