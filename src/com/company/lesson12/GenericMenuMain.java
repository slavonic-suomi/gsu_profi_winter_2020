package com.company.lesson12;


import com.company.lesson12.model.AutoTransport;
import com.company.lesson12.model.TransportFactory;

public class GenericMenuMain {

    public static void main(String[] args) {
        Factory<AutoTransport> factory = new TransportFactory();
        GenericContainer<AutoTransport> container = new GenericContainer<>();

        MenuItem<AutoTransport>[] items = new MenuItem[3];

        items[0] = new AddMenuItem<>(container, factory);
        items[1] = new DeleteMenuItem<>(container);
        items[2] = new PrintAllMenuItem<>(container);
        TopLevelMenu<AutoTransport> menu1 = new TopLevelMenu<>(items, "auto transoprt menu", 0);

        menu1.execute();
    }
}
