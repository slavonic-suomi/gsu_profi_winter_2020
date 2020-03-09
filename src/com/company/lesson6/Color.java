package com.company.lesson6;

public enum Color {
    BLACK("#ffaabb"),
    YELLOW("#ffaacc"),
    RED("#ffaadd"),
    GREEN("#ffaaaa");

    private String hexColor;

    Color(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getHexColor() {
        return hexColor;
    }
}
