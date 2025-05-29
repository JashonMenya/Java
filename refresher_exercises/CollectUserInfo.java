package refresher_exercises;

import java.io.Console;
import java.util.regex.Pattern;

import java.util.Scanner;

/**
 * Get basic user info. firstName, lastName, email
 */
public class CollectUserInfo {

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user = collectUserInfo(scanner);
        if (user != null) {
            System.out.println("\nUser information collected: ");
            System.out.println(user);
        }
        scanner.close();

    }

    public static String getuserPassword() {
        Console console = System.console();
        String password = "";
        if (console != null) {
            char[] passwordCharacters = console.readPassword("Enter your password: ");
            password= new String(passwordCharacters);
            System.out.println("console statement");
        }
        return password;
    }

    public static User collectUserInfo(Scanner scanner) {
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine().trim();

        if (!EMAIL_PATTERN.matcher(email).matches()) {
            System.out.println("Invalid email format. Please try again.");
            return null;
        }

        String password = getuserPassword();




        return new User(firstName, lastName, email, password);

    }
}
