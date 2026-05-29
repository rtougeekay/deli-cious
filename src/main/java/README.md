![Blank diagram.png](../../../diagram/Blank%20diagram.png)

# DELI-cious Capstone Project

## Overview
DELI-cious is a Java command-line sandwich shop application where customers can create and customize food orders. Users can add sandwiches, drinks, and chips, then checkout and save a receipt file.

This project was built using Java object-oriented programming concepts such as:
- Classes and Objects
- Constructors
- Methods
- ArrayLists
- Encapsulation
- File Writing
- Packages
- User Input
- Loops and Conditional Statements

---

# Features

## Home Screen
Users can:
- Start a new order
- Exit the application

---

## Order Screen
Users can:
- Add Sandwiches
- Add Drinks
- Add Chips
- Checkout
- Cancel Order

---

## Sandwich Customization
Users can choose:
- Sandwich Size (4, 8, 12 inches)
- Bread Type
- Meats
- Cheeses
- Toppings
- Sauces
- Toasted or Not Toasted

The sandwich price changes depending on:
- Sandwich size
- Amount of meats
- Amount of cheeses

---

## Drink Options
Users can choose:
- Drink Size
    - Small
    - Medium
    - Large

- Drink Flavor
    - Sprite
    - Coke
    - Pepsi
    - Lemonade
    - Ginger Ale

---

## Chips Options
Users can choose:
- Doritos
- Cheetos
- Ruffles
- Lay’s
- Herr’s

---

## Checkout
During checkout:
- A receipt is displayed
- The total order price is calculated
- The user confirms the order
- The receipt is saved into a receipt text file

---

# Technologies Used
- Java
- IntelliJ IDEA
- Maven
- FileWriter / BufferedWriter
- ArrayList
- Scanner

---

# Project Structure

```text
src
└── main
    └── java
        └── com.pluralsight
            ├── App.java
            ├── data
            │   └── ReceiptWriter.java
            ├── model
            │   ├── Chips.java
            │   ├── Drink.java
            │   ├── Order.java
            │   └── Sandwich.java
            └── ui
                └── UserInterface.java
