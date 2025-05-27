package refresher_exercises;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option(1,2,3,4, (5,6- same logic) ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("User selected option 1");
                break;
            case 2:
                System.out.println("User selected option 2");
                break;
            case 3:
                System.out.println("User selected option 3");
                break;
            case 4:
                System.out.println("User selected option 4");
                break;
            case 5:
            case 6:
                System.out.println("User selected option " + choice);
                break;
            default:
                System.out.println("No valid option selected");
        }
    }
}
