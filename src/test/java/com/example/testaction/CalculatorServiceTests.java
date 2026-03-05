package com.example.testaction;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("CalculatorService - Test luồng CI")
class CalculatorServiceTests {

    private final CalculatorService calculator = new CalculatorService();

    @Test
    @DisplayName("add - cộng hai số dương")
    void addPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    @DisplayName("add - cộng số âm")
    void addWithNegative() {
        assertEquals(0, calculator.add(-2, 2));
        assertEquals(-5, calculator.add(-3, -2));
    }

    @Test
    @DisplayName("subtract - trừ hai số")
    void subtractNumbers() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    @DisplayName("isEven - số chẵn")
    void isEvenWithEvenNumber() {
        assertTrue(calculator.isEven(0));
        assertTrue(calculator.isEven(2));
        assertTrue(calculator.isEven(-4));
    }

    @Test
    @DisplayName("isEven - số lẻ")
    void isEvenWithOddNumber() {
        assertFalse(calculator.isEven(1));
        assertFalse(calculator.isEven(-3));
    }

}
