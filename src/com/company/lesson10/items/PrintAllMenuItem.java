package com.company.lesson10.items;

import com.company.lesson10.AutoTransport;
import com.company.lesson10.IMenuItem;
import com.company.lesson10.TransportContainer;

public class PrintAllMenuItem implements IMenuItem {

    private TransportContainer container;

    public PrintAllMenuItem(TransportContainer container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 4;
    }

    @Override
    public String getTitle() {
        return "Print all";
    }

    @Override
    public void execute() {
        AutoTransport[] array = container.getArray();
        for (int i = 0; i < container.size(); i++) {
            System.out.println(array[i]);
        }
    }
}
