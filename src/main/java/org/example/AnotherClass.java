package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AnotherClass {

    // Creación del logger
    private static final Logger logger = Logger.getLogger(AnotherClass.class.getName());

    public int getLength(String input) {
        if (input == null) {
            logger.warning("Input string is null, returning length 0");
            return 0;
        }
        int length = input.length();
        logger.log(Level.INFO, () -> String.format("Returning length: %d", length));  // Compliant, usando Supplier
        return length;
    }

    public String toUpperCase(String input) {
        if (input == null) {
            logger.warning("Input string is null, returning null");
            return null;
        }
        String upperCase = input.toUpperCase();
        logger.log(Level.INFO, () -> String.format("Converting to upper case: %s", upperCase));  // Compliant, usando Supplier
        return upperCase;
    }

    public boolean isEmpty(String input) {
        if (input == null) {
            logger.warning("Input string is null, returning true");
            return true;
        }
        boolean isEmpty = input.isEmpty();
        logger.log(Level.INFO, () -> String.format("Is string empty: %b", isEmpty));  // Compliant, usando Supplier
        return isEmpty;
    }
}
