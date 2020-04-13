package com.company.lesson10;

public class TransportContainer {
    private AutoTransport[] array = new AutoTransport[10];
    private int count = 0;


    public void add(AutoTransport element) {
        if (count == array.length) {
            AutoTransport[] newArray = new AutoTransport[(int) (array.length * 1.5)];
//            for (int i = 0; i < count ; i++) {
//                newArray[i] = array[i];
//            }
            System.arraycopy(array, 0, newArray, 0, count);
            array = newArray;
        }
        array[count++] = element;
    }

    public void update(int index, AutoTransport element) {
        array[index] = element;
    }

    public void delete(int index) {
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public AutoTransport[] getArray() {
        return array;
    }

    public int size() {
        return count;
    }
}
