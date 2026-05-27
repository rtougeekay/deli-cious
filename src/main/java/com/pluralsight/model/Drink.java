package com.pluralsight.model;

public class Drink {
    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public double getPrice() {
        if (size.equalsIgnoreCase("small")) {
            return 2.00;
        } else if (size.equalsIgnoreCase("medium")) {
            return 2.50;
        } else {
            return 3.00;
        }
    }

    public String toString() {
        return size + " " + flavor + " drink - $" + getPrice();
    }
}