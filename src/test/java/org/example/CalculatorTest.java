package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Addition should be correct");
    }

    @Test
    void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "Subtraction should be correct");
    }

    @Test
    void testMultiply() {
        int result = calculator.multiply(2, 3);
        assertEquals(6, result, "Multiplication should be correct");
    }

    @Test
    void testDivide() {
        double result = calculator.divide(6, 2);
        assertEquals(3.0, result, "Division should be correct");
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(1, 0), "Division by zero should throw an exception");
    }
}
