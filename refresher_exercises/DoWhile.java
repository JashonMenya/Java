package refresher_exercises;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0 to exit): ");
        int userNumber = sc.nextInt();
        int counter = 1;

        do {

            System.out.println("Do while statement running " + counter);
            System.out.print("Enter another number (0 to exit): ");
            counter++;
            // userNumber = sc.nextInt();
            userNumber--;
        } while (userNumber != 0);

        sc.close();
        System.out.println("Exited loop. Goodbye!");

    }
}
