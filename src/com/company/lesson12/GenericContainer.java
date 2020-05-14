package com.company.lesson12;


import java.util.Arrays;

public class GenericContainer<T> {

    private T[] array = (T[]) new Object[10];
    private int count = 0;


    public void add(T element) {
        if (count == array.length) {
            T[] newArray = (T[]) new Object[(int) (array.length * 1.5)];
//            for (int i = 0; i < count ; i++) {
//                newArray[i] = array[i];
//            }
            System.arraycopy(array, 0, newArray, 0, count);
            array = newArray;
        }
        array[count++] = element;
    }

    public void update(int index, T element) {
        array[index] = element;
    }

    public void delete(int index) {
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;
    }

    public T[] getArray() {
        return array;
    }


    public void printAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }


    public void sort() {
        Arrays.sort(array);
    }

    public int size() {
        return count;
    }
}
