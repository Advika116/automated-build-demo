package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0));
    }
}
