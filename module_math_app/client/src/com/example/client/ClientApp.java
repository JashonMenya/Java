package com.example.client;

import com.example.math.MathUtils;

public class ClientApp {
    public static void main(String[] args) {

        // Addition
        int addition = MathUtils.add(2, 2);
        System.out.println("Results: " + addition);

        //Subtraction
        int subtraction = MathUtils.subtract(8, 4);
        System.out.println("Results: " + subtraction);

        // Multiplication
        int multiply = MathUtils.multiply(2, 2);
        System.out.println("Results: " + multiply);

        // Divide
        int divide = MathUtils.divide(8, 2);
        System.out.println("Results: " + divide);
    }
}