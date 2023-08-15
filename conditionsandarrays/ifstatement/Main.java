/**
 * Main class for if statement example.
 */
package conditionsandarrays.ifstatement;

import java.util.Scanner;

/**
 * Main class for if statement example.
 */
public class Main {
    public static void main(String[] args) {

        /*
         * Customer Name variable
         */
        final String CustomerName = "JJ";
        /*
         * Item Description variable
         */
        String itemDesc = "Shirt";

        /*
         * Price variable
         */
        final double price = 21.99;
        /*
         * Quantity variable
         */
        final int QUANTITY = 4;
        /*
         * Tax variable
         */
        final double TAX = 1.04;

        /*
         * Scanner variable
         */
        Scanner scanner = new Scanner(System.in);

        /*
         * Getting user input for stock status
         */
        System.out.print("Enter a boolean value (true/false): ");

        /*
         * Stock status variable
         */
        boolean stockStatus = scanner.nextBoolean();

        /*
         * Closing scanner
         */
        scanner.close();

        /*
         * Message variable
         */
        String message = CustomerName + " wants to purchase " + QUANTITY + " " + itemDesc;

        /*
         * Total variable
         */
        final double total = (price * QUANTITY) * TAX;

        /*
         * If statement
         */
        if (QUANTITY > 1) {
            message = message + "s";
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);
            stockStatus = false;

            if (stockStatus) {
                System.out.println("In stock");
            } else {
                System.out.println("Out of stock");
            }

        }
    }

}
