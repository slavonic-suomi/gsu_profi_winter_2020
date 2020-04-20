package com.company.lesson12;

import com.company.lesson10.AutoTransport;
import com.company.lesson10.IMenuItem;
import com.company.lesson10.TransportContainer;

public class PrintAllMenuItem<T> implements MenuItem<T> {

    private GenericContainer<T> container;

    public PrintAllMenuItem(GenericContainer<T> container) {
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
        container.printAll();
    }
}
