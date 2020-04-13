package com.company.lesson10.items;

import com.company.lesson10.IMenuItem;
import com.company.lesson10.TransportContainer;
import com.company.lesson10.TransportFactory;

public class AddMenuItem implements IMenuItem {

    private TransportContainer container;
    private TransportFactory factory;

    public AddMenuItem(TransportContainer container, TransportFactory factory) {
        this.container = container;
        this.factory = factory;
    }

    @Override
    public int getOrder() {
        return 1;
    }

    @Override
    public String getTitle() {
        return "Add element";
    }

    @Override
    public void execute() {
        container.add(factory.create());
    }
}
