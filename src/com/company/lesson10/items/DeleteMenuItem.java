package com.company.lesson10.items;

import com.company.lesson10.IMenuItem;
import com.company.lesson10.ScannerWrapper;
import com.company.lesson10.TransportContainer;

public class DeleteMenuItem implements IMenuItem {

    private TransportContainer container;
    private ScannerWrapper sc = new ScannerWrapper();


    public DeleteMenuItem(TransportContainer container) {
        this.container = container;
    }

    @Override
    public int getOrder() {
        return 3;
    }

    @Override
    public String getTitle() {
        return "Delete element";
    }

    @Override
    public void execute() {
        System.out.println("Input index");
        int choice = sc.nextInt(0, container.size());

        container.delete(choice);
    }
}
