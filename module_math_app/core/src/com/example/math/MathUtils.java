package com.example.math;

/**
 * This class provides utility methods for mathematical operations.
 */
public final class MathUtils {

    private MathUtils() {
        throw new UnsupportedOperationException("MathUtils class cannot be instantiated.");
    }

    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public static int add(final int a, final int b) {
        return a + b;
    }

    /**
     * Subtracts two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The difference between the two numbers.
     */
    public static int subtract(final int a, final int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of the two numbers.
     */
    public static int multiply(final int a, final int b) {
        return a * b;
    }

    /**
     * Divides two numbers.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The division result.
     * @throws ArithmeticException If the denominator is zero.
     */
    public static int divide(final int a, final int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
