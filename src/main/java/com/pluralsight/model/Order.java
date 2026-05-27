package com.pluralsight.model;

import java.util.ArrayList;

public class Order {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Drink> drinks;
    private ArrayList<Chips> chips;

    public Order() {
        sandwiches = new ArrayList<>();
        drinks = new ArrayList<>();
        chips = new ArrayList<>();
    }

    public void addSandwich(Sandwich sandwich) {
        sandwiches.add(sandwich);
    }

    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    public void addChips(Chips chip) {
        chips.add(chip);
    }

    public double getTotal() {
        double total = 0;

        for (Sandwich sandwich : sandwiches) {
            total += sandwich.getPrice();
        }

        for (Drink drink : drinks) {
            total += drink.getPrice();
        }

        for (Chips chip : chips) {
            total += chip.getPrice();
        }

        return total;
    }

    public String getReceiptText() {
        String receipt = "=== DELI-cious Receipt ===\n\n";

        receipt += "Sandwiches:\n";
        for (Sandwich sandwich : sandwiches) {
            receipt += sandwich + "\n\n";
        }

        receipt += "Drinks:\n";
        for (Drink drink : drinks) {
            receipt += drink + "\n";
        }

        receipt += "\nChips:\n";
        for (Chips chip : chips) {
            receipt += chip + "\n";
        }

        receipt += "\nTOTAL: $" + getTotal();

        return receipt;
    }
}