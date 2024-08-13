package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class AnotherClassTest {

    @Test
    void testGetLength() {
        AnotherClass anotherClass = new AnotherClass();
        int result = anotherClass.getLength("Hello");
        assertEquals(5, result, "Length should be 5");
    }

    @Test
    void testToUpperCase() {
        AnotherClass anotherClass = new AnotherClass();
        String result = anotherClass.toUpperCase("hello");
        assertEquals("HELLO", result, "String should be converted to uppercase");
    }

    @Test
    void testIsEmpty() {
        AnotherClass anotherClass = new AnotherClass();
        boolean result = anotherClass.isEmpty("Wromg");
        assertFalse(result, "String should not be empty");
    }
}
