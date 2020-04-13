package com.company.lesson10;

import com.company.lesson10.items.AddMenuItem;
import com.company.lesson10.items.DeleteMenuItem;
import com.company.lesson10.items.PrintAllMenuItem;

public class ComplexMenuMain {
    public static void main(String[] args) {
        TransportContainer container = new TransportContainer();
        TransportFactory factory = new TransportFactory();

        IMenuItem[] innerMenu = {
                new PrintAllMenuItem(container),
                new PrintAllMenuItem(container)
        };

        IMenuItem[] array = {
                new AddMenuItem(container, factory),
                new DeleteMenuItem(container),
                new PrintAllMenuItem(container),
                new TopLevelMenu(innerMenu, "inner menu", 5)
        };

        new TopLevelMenu(array, "top menu", 0).run();
    }
}
