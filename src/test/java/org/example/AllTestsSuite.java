package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculatorTest.class,
        AnotherClassTest.class
})
public class AllTestsSuite {
    // No es necesario agregar ningún código adicional aquí.
    // La suite de pruebas ejecutará todos los casos de prueba en CalculatorTest y AnotherClassTest.
}
