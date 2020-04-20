package com.company.lesson13;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {
//        Vector<Integer> vec = new Vector<>();
//        Hashtable<String, Integer> stringIntegerHashtable = new Hashtable<>();

        Collection<Integer> ints = List.of(1,6,4,2);

        Iterator<Integer> iterator = ints.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        for (int i : ints) {
            System.out.println(i);
        }


//        Collection -> List, Set, Queue
        System.out.println("===================");

        List<Integer> intList = List.of(1,2,7,6);
        intList = new ArrayList<>(intList);
        System.out.println(intList.get(0));
        System.out.println(intList.get(3));

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

        intList.set(0, 34);
        intList.add(999);

        System.out.println(intList);


    }
}
