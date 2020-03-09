package com.company.lesson7;

public class StringMain {
    public static void main(String[] args) {
        String s1 = "  asdQWE123  ";
//        int x = '0';
//        char c = 32;
//        System.out.println(c);

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        String substring = s1.substring(2, 4);
        System.out.println(substring);

        System.out.println(s1.trim());

        System.out.println(s1.contains("as"));

        System.out.println(s1.replaceAll("[0-9]", "Z"));

    }
}
