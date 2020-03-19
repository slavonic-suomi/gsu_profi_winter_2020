package com.company.lesson6.inner;

import com.company.lesson6.Color;
import com.company.lesson6.NumberedObject;

public class PrivateTransport extends Object
    implements NumberedObject {
    protected int weight;
    private String number;
    private Color color = Color.RED;

    public PrivateTransport() {
        this(100, "ty2");
    }

    public PrivateTransport(int weight, String number) {
        this.weight = weight;
        this.number = number;
        System.out.println("base constr invocation");
    }


    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    protected void drive() {
        System.out.println("i'm pt");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");
    }
/*
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }

        Class thisClass = this.getClass();
        Class otherClass1 = o.getClass();

        if (!thisClass.equals(otherClass1)) {
            return false;
        }

        PrivateTransport other = (PrivateTransport) o;
        if (this.weight == other.weight &&
            this.number.equals(other.number) ) {
            return true;
        } else {
            return false;
        }
    }

 */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrivateTransport that = (PrivateTransport) o;

        if (weight != that.weight) return false;
        return number != null ? number.equals(that.number) : that.number == null;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
//        StringBuilder res = new StringBuilder();
//        return res.append("weight=").append(weight)
//                .append(", color=").append(color)
//                .toString();
        return "" +
                "weight=" + weight +
                ", color=" + color +
                ", number='" + number + '\''
                ;
    }

    @Override
    public int compareTo(NumberedObject o) {
        return this.number.compareTo(o.getNumber());
    }
}
