package com.lab9.may_5_2026;

public class PriceCalculator {
    public double calculateDrinkPrice(String coffeeType, String size) {
        double price = 0.0;
        if (coffeeType != null) {
            if (coffeeType.contains("Espresso")) {
                price += 3.0;
            } else if (coffeeType.contains("Latte")) {
                price += 4.50;
            } else if (coffeeType.contains("Mocha")) {
                price += 5.0;
            }
        }
        if ("Medium".equalsIgnoreCase(size)) {
            price += 1.0;
        } else if ("Large".equalsIgnoreCase(size)) {
            price += 2.0;
        }
        return price;
    }
}

