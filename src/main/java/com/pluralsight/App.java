package com.pluralsight;

import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("=== DELI-cious ===");
            System.out.println("1 - New Order");
            System.out.println("0 - Exit");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                startOrder();
            } else if (choice.equals("0")) {
                running = false;
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    public static void startOrder() {
        Order order = new Order();
        boolean ordering = true;

        while (ordering) {
            System.out.println();
            System.out.println("=== Order Screen ===");
            System.out.println("1 - Add Sandwich");
            System.out.println("2 - Add Drink");
            System.out.println("3 - Add Chips");
            System.out.println("4 - Checkout");
            System.out.println("0 - Cancel Order");
            System.out.print("Choose an option: ");

            String choice = input.nextLine();

            if (choice.equals("1")) {
                Sandwich sandwich = createSandwich();
                order.addSandwich(sandwich);
            } else if (choice.equals("2")) {
                Drink drink = createDrink();
                order.addDrink(drink);
            } else if (choice.equals("3")) {
                Chips chips = createChips();
                order.addChips(chips);
            } else if (choice.equals("4")) {
                checkout(order);
                ordering = false;
            } else if (choice.equals("0")) {
                System.out.println("Order canceled.");
                ordering = false;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    public static Sandwich createSandwich() {
        System.out.print("Choose sandwich size (4, 8, 12): ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("Choose bread (white, wheat, rye, wrap): ");
        String bread = input.nextLine();

        Sandwich sandwich = new Sandwich(size, bread);

        System.out.print("Add meat? Enter type or leave blank: ");
        String meat = input.nextLine();
        if (!meat.equals("")) {
            sandwich.addMeat(meat);
        }

        System.out.print("Add cheese? Enter type or leave blank: ");
        String cheese = input.nextLine();
        if (!cheese.equals("")) {
            sandwich.addCheese(cheese);
        }

        System.out.print("Add regular topping? Enter type or leave blank: ");
        String topping = input.nextLine();
        if (!topping.equals("")) {
            sandwich.addTopping(topping);
        }

        System.out.print("Add sauce? Enter type or leave blank: ");
        String sauce = input.nextLine();
        if (!sauce.equals("")) {
            sandwich.addSauce(sauce);
        }

        System.out.print("Toasted? yes/no: ");
        String toasted = input.nextLine();

        if (toasted.equalsIgnoreCase("yes")) {
            sandwich.setToasted(true);
        }

        System.out.println("Sandwich added.");
        return sandwich;
    }

    public static Drink createDrink() {
        System.out.print("Choose drink size (small, medium, large): ");
        String size = input.nextLine();

        System.out.print("Choose drink flavor: ");
        String flavor = input.nextLine();

        System.out.println("Drink added.");
        return new Drink(size, flavor);
    }

    public static Chips createChips() {
        System.out.print("Choose chip type: ");
        String type = input.nextLine();

        System.out.println("Chips added.");
        return new Chips();
    }

    public static void checkout(Order order) {
        System.out.println();
        System.out.println(order.getReceiptText());

        System.out.print("Confirm order? yes/no: ");
        String confirm = input.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            ReceiptWriter.saveReceipt(order);
        } else {
            System.out.println("Order canceled.");
        }
    }
}