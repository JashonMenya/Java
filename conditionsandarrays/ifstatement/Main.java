package conditionsandarrays.ifstatement;

import java.util.Scanner;

/**
 * This class demonstrates the use of if statements in Java.
 */
public class Main {
    public static void main(String[] args) {
        final String customerName = "JJ";
        String itemDesc = "Shirt";
        final double price = 21.99;
        final int quantity = 4;
        final double tax = 1.04;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a boolean value (true/false): ");
        boolean stockStatus = scanner.nextBoolean();

        scanner.close();

        String message = customerName + " wants to purchase " + quantity + " " + itemDesc;
        final double total = (price * quantity) * tax;

        if (quantity > 1) {
            message = message + "s";
            System.out.println(message);
            System.out.println("Total cost with tax: " + total);

            if (stockStatus) {
                System.out.println("In stock");
            } else {
                System.out.println("Out of stock");
            }
        }
    }
}
