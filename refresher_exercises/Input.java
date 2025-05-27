package refresher_exercises;

import java.util.Scanner;

public class Input {
    public static void main(String[] args)  {
        System.out.println("What is your name: ");

        // Name
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // age
        System.out.println("What is your age: ");
        int age = scanner.nextInt();

        StringBuilder nameAndAge = new StringBuilder();
        System.out.println("User info: " + nameAndAge.append(name + " ").append(age));
    }
}
