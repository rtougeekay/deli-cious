package com.pluralsight;

import java.util.ArrayList;

public class Sandwich {
    private int size;
    private String bread;
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private ArrayList<String> toppings;
    private ArrayList<String> sauces;
    private boolean toasted;

    public Sandwich(int size, String bread) {
        this.size = size;
        this.bread = bread;
        this.meats = new ArrayList<>();
        this.cheeses = new ArrayList<>();
        this.toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.toasted = false;
    }

    public void addMeat(String meat) {
        meats.add(meat);
    }

    public void addCheese(String cheese) {
        cheeses.add(cheese);
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void addSauce(String sauce) {
        sauces.add(sauce);
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public double getPrice() {
        double price = 0;

        if (size == 4) {
            price = 5.50;
            price += meats.size() * 1.00;
            price += cheeses.size() * 0.75;
        } else if (size == 8) {
            price = 7.00;
            price += meats.size() * 2.00;
            price += cheeses.size() * 1.50;
        } else if (size == 12) {
            price = 8.50;
            price += meats.size() * 3.00;
            price += cheeses.size() * 2.25;
        }

        return price;
    }

    public String toString() {
        return size + "\" " + bread + " sandwich\n"
                + "Meats: " + meats + "\n"
                + "Cheeses: " + cheeses + "\n"
                + "Toppings: " + toppings + "\n"
                + "Sauces: " + sauces + "\n"
                + "Toasted: " + toasted + "\n"
                + "Price: $" + getPrice();
    }
}