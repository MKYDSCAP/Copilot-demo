package com.copilot.demo;

/**
 * Calculator class demonstrating basic arithmetic operations
 */
public class Calculator {
    
    /**
     * Add two numbers
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtract b from a
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiply two numbers
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divide a by b
     * @param a numerator
     * @param b denominator
     * @return quotient of a and b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    /**
     * Raise a to the power of b
     * @param a base
     * @param b exponent
     * @return a raised to the power of b
     */
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}
