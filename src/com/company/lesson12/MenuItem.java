package com.company.lesson12;

public interface MenuItem<T> {

    int getOrder();

    String getTitle();

    void execute();
}
