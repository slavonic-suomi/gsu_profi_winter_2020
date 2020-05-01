package com.company.lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AnotherListMain {
    public static final int SIZE = 200_000;

    public static void main(String[] args) {

        long start1 = System.currentTimeMillis();
        testArrayList();
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        testLinkedList();
        long end2 = System.currentTimeMillis();

        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
    }

    private static void testArrayList() {
        List<Integer> array  = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            array.add(array.size() / 2, i);
        }
    }

    private static void testLinkedList() {
        List<Integer> linked = new LinkedList<>();
        for (int i = 0; i < SIZE; i++) {
            linked.add(linked.size() / 2, i);
        }
    }
}
