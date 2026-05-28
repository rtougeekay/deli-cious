package com.pluralsight.ui;

import com.pluralsight.model.Order;

public class UserInterface {

    public static void showHomeScreen() {
        System.out.println();
        System.out.println("=== DELI-cious ===");
        System.out.println("1 - New Order");
        System.out.println("0 - Exit");
        System.out.print("Choose an option: ");
    }

    public static void showOrderScreen() {
        System.out.println();
        System.out.println("=== Order Screen ===");
        System.out.println("1 - Add Sandwich");
        System.out.println("2 - Add Drink");
        System.out.println("3 - Add Chips");
        System.out.println("4 - Checkout");
        System.out.println("0 - Cancel Order");
        System.out.print("Choose an option: ");
    }

    public static void showSandwichMenu() {
        System.out.println();
        System.out.println("=== Build Sandwich ===");
        System.out.println("Sizes: 4, 8, 12");
        System.out.println("Bread: white, wheat, rye, wrap");
        System.out.println("Meats: steak, ham, salami, roast beef, chicken, bacon");
        System.out.println("Cheese: american, provolone, cheddar, swiss");
        System.out.println("Toppings: lettuce, peppers, onions, tomatoes, jalapenos, cucumbers, pickles, guacamole, mushrooms");
        System.out.println("Sauces: mayo, mustard, ketchup, ranch, thousand islands, vinaigrette");
    }
    public static void showDrinkMenu() {
        System.out.println();
        System.out.println("=== Drinks ===");
        System.out.println("Sizes: small, medium, large");
        System.out.println("Flavors: lemonade, coke, sprite, ginger ale");
    }

    public static void showChipsMenu() {
        System.out.println();
        System.out.println("=== Chips ===");
        System.out.println("Options: Doritos, Ruffles, Lay's, Herr's");
    }
    public static void showCheckout(Order order) {
        System.out.println();
        System.out.println(order.getReceiptText());
        System.out.print("Confirm order? yes/no: ");
    }
}