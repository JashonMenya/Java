package refresher_exercises.sandbox;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class MainUserInteraction {

    public static void main(String[] args) {
        // Get User Input

        Scanner scanner = new Scanner(System.in);
        List<UserProfile> userProfiles = new ArrayList<>();

        int profilesToCreate = 2;
        while (profilesToCreate > 0) {
            userProfiles.add(collectUserData(scanner));
            profilesToCreate--;
        }
        System.out.println(userProfiles);

        // Cheking age status
        for (UserProfile userprofile : userProfiles) {
            System.out.println(userprofile);
        }

    }

    public static UserProfile collectUserData(Scanner scanner) {
        System.out.println("What's your First Name");
        String firstName = scanner.nextLine();
        System.out.println("What's your Last Name");
        String lastName = scanner.nextLine();
        System.out.println("What's your email");
        String email = scanner.nextLine();
        System.out.println("What's your age");
        int age = scanner.nextInt();
        scanner.nextLine();
        return new UserProfile(firstName, lastName, email, age);
    }

}
