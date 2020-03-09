package com.company.lesson6;

public class User implements NumberedObject {

    private String number;

    @Override
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(NumberedObject o) {
        return 0;
    }
}
