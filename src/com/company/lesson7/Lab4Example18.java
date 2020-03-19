package com.company.lesson7;

public class Lab4Example18 {
    public static void main(String[] args) {
        String input = "asdqwe aaa as12321sa qweewq dfg qwer";
        String[] strings = input.split(" ");
        int maxLength = -1, maxIndex = 0;
        for (int i = 0; i < strings.length; i++) {
            String reverseString = new StringBuilder(strings[i]).reverse().toString();
            if (reverseString.equals(strings[i]) && strings[i].length() > maxLength) {
                maxIndex = i;
                maxLength = strings[i].length();
            }
        }

        if (maxLength > -1) {
            System.out.println(strings[maxIndex]);
        }
    }
}
