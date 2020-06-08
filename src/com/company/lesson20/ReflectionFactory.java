package com.company.lesson20;

import com.company.lesson5.Transport;

import java.util.List;

public class ReflectionFactory {
    private final List<Class<?>> classes;

    public ReflectionFactory(List<Class<?>> classes) {
        this.classes = classes;
    }

    public Object create() {
        System.out.println("Choose class");
        for (int i = 0; i < classes.size(); i++) {
            System.out.println( (i + 1)  + " " + classes.get(i).getSimpleName());
        }
        //...
        return null;
    }
}
