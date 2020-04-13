package com.company.lesson11;

public class GenericContainerMain {
    public static void main(String[] args) {
        GenericContainer<String> strs = new GenericContainer<String>();

        strs.add("qwe");
        strs.add("asd");


//        String[] array = strs.getArray();
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
    }
}
