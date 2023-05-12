package com.example.client;

import com.example.math.MathUtils;

/**
 * This class demonstrates basic arithmetic operations using the MathUtils
 * class.
 */
public final class ClientApp {
    private ClientApp() {
        // Private constructor to prevent instantiation
    }

    /**
     * The entry point of the program.
     *
     * @param args The command-line arguments.
     */
    public static void main(final String[] args) {
        // Addition
        final int addition = MathUtils.add(2, 2);
        System.out.println("Results: " + addition);

        // Subtraction
        final int subtraction = MathUtils.subtract(8, 4);
        System.out.println("Results: " + subtraction);

        // Multiplication
        final int multiply = MathUtils.multiply(2, 2);
        System.out.println("Results: " + multiply);

        // Divide
        final int divide = MathUtils.divide(8, 2);
        System.out.println("Results: " + divide);
    }
}
