package com.company.lesson11;

import com.company.lesson10.Car;
import com.company.lesson11.rec.Computer;
import com.company.lesson11.rec.Phone;
import com.company.lesson11.rec.Product;
import com.company.lesson10.AutoTransport;

public class GenericInheritance {
    public static void main(String[] args) {
        Object o1 = "asd";
        Product<?> p = new Phone(1);


        Box<Object> box1 = null;
        Box<String> box2 = new Box<>(null);

//        box1 = box2;

        Box<String> box3 = new NumberedBox<String>("asd");
        transfer(box3, box2);
//        transfer2(box3, box1);

        System.out.println(box2.getValue());

        Box<Car> carBox = new Box<>(new Car("asd", 123));
        Box<AutoTransport>  transportBox = new Box<>(null);

        transfer2(carBox, transportBox);

        System.out.println(transportBox.getValue());
    }

    public static <T> void transfer(Box<T> from, Box<T> to) {
        to.setValue(from.getValue());
    }

    //PECS - producer extends, consumer super
    public static void transfer2(Box<? extends AutoTransport> from, Box<? super AutoTransport> to) {
        to.setValue(from.getValue());
    }
}
