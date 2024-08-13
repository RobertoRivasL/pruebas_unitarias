package org.example;

import java.util.logging.Logger;

public class App {

    // Creación del logger
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        AnotherClass anotherClass = new AnotherClass();

        int length = anotherClass.getLength("Hello");
        logger.info(() -> String.format("Length of 'Hello': %d", length));  // Compliant, usando Supplier

        String upperCase = anotherClass.toUpperCase("hello");
        logger.info(() -> String.format("Upper case of 'hello': %s", upperCase));  // Compliant, usando Supplier

        boolean isEmpty = anotherClass.isEmpty("Wromg");
        logger.info(() -> String.format("Is 'Wromg' empty?: %b", isEmpty));  // Compliant, usando Supplier
    }
}
