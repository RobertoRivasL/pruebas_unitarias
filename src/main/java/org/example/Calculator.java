package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calculator {

    // Creación del logger
    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public int add(int a, int b) {
        int result = a + b;
        logger.log(Level.INFO, () -> String.format("Result of adding %d and %d is %d", a, b, result));  // Compliant, usando Supplier
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        logger.log(Level.INFO, () -> String.format("Result of subtracting %d from %d is %d", b, a, result));  // Compliant, usando Supplier
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        logger.log(Level.INFO, () -> String.format("Result of multiplying %d and %d is %d", a, b, result));  // Compliant, usando Supplier
        return result;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            logger.severe("Cannot divide by zero");  // Compliant, log error without concatenation
            throw new ArithmeticException("Cannot divide by zero");
        }
        double result = (double) a / b;
        logger.log(Level.INFO, () -> String.format("Result of dividing %d by %d is %.2f", a, b, result));  // Compliant, usando Supplier
        return result;
    }
}
