package com.lab9.may_5_2026;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriceCalculatorTest {
    private PriceCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new PriceCalculator();
    }

    @Test
    void testCalculatorDrinkPrice_SmallEspresso() {
        // Arrange
        String coffeeType = "Espresso ($3.00)";
        String size = "Small";

        // Act
        double result = calculator.calculateDrinkPrice(coffeeType, size);

        // Assert (Expected value, Actual value, Delta for floating point precision)
        assertEquals(3.00, result, 0.001);
    }

    @Test
    void testCalculatorDrinkPrice_MediumLatte() {
        // Arrange
        String coffeeType = "Latte ($4.50)";
        String size = "Medium";

        // Act
        double result = calculator.calculateDrinkPrice(coffeeType, size);

        // Assert
        assertEquals(5.50, result, 0.001);
    }

    @Test
    void testCalculatorDrinkPrice_LargeEspresso() {
        // Arrange
        String coffeeType = "Mocha ($5.00)";
        String size = "Large";

        // Act
        double result = calculator.calculateDrinkPrice(coffeeType, size);

        // Assert (Base $5.00 + Large Upcharge $2.00 = $7.00)
        assertEquals(7.00, result, 0.001);
    }

    @Test
    void testCalculateDrinkPrice_NullCoffee_ReturnsZero() {
        // Arrange
        String size = "Medium";

        // Act
        double result = calculator.calculateDrinkPrice(null, size);

        // Assert
        assertEquals(0.00, result, 0.001);
    }
}
