package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        assertEquals(5.0, Calculator.add(2, 3));
        assertEquals(0.0, Calculator.add(0, 0));
    }

    @Test
    void testSubtraction() {

        assertEquals(-1.0, Calculator.subtract(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6.0, Calculator.multiply(2, 3));
        assertEquals(0.0, Calculator.multiply(0, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(2, 0));
    }

    @Test
    void testDivision() {

        assertEquals(2.0, Calculator.divide(6, 3));
    }

    @Test
    void testSqrtNegative() {
        assertThrows(InvalidInputException.class, () -> Calculator.sqrt(-1));
    }

    @Test
    void testSqrtValid() {
        assertDoesNotThrow(() -> assertEquals(2.0, Calculator.sqrt(4)));
    }
}