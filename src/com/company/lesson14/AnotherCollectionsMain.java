package com.company.lesson14;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class AnotherCollectionsMain {
    public static void main(String[] args) {
        // Set Queue
        //хеш таблицы
        Set<Integer> intSet = new LinkedHashSet<>();

        intSet.add(1);
        intSet.add(4);
        intSet.add(2);
        intSet.add(1);

        System.out.println(intSet);

        Set<Integer> intTSet = new TreeSet<>();

        ///
        Queue<Integer> intQ = new LinkedList<>();

        intQ.offer(2);
        intQ.offer(1);
        intQ.offer(3);

//        System.out.println(intQ.remove());
//        System.out.println(intQ.remove());
//        System.out.println(intQ.remove());
//        System.out.println(intQ.remove());
        System.out.println(intQ.poll());
        System.out.println(intQ.poll());
        System.out.println(intQ.poll());
        System.out.println(intQ.poll());
        System.out.println(intQ.poll());


        Map<String, Integer> map = new HashMap<>();
        map.put("qweasd", 123);
        map.put("asdeee", 456);

        Integer value = map.get("qweasd");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(map.get(key));
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getValue());
        }

//        System.out.println(value);


    }
}
