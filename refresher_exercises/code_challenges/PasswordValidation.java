package refresher_exercises.code_challenges;

import java.util.Scanner;

/*********************************************************
 * Write your answer here, and then test your code.
 * Your job is to implement the validatePassword() method.
 **********************************************************/

public class PasswordValidation {
    public static void main(String args[]) {
        String newPassword = "janedoe";
        boolean result = Answer.validatePassword(newPassword);
    }
}

class Answer {

    /***************************************************
     * Change these boolean values to control whether you see
     * the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Current credentials
    static String username = "jane_doe";
    static String currentPassword = "jane_doe";

    static boolean validatePassword(String newPassword) {
        Scanner scanner = new Scanner(System.in);

        /***************************************************
         * TODO: Your code goes here
         *
         * Criteria:
         * at least 8 characters long
         * contains an uppercase letter
         * contains a special character
         * does not contain the username
         * is not the same as the old password
         */
        while (true) {
            StringBuilder passwordErrors = new StringBuilder();
            boolean validPassword = true;

            if (newPassword.length() < 8) {
                passwordErrors.append("Length requirement not met. \n");
                validPassword = false;
            }

            if (newPassword.equals(newPassword.toLowerCase())) {
                passwordErrors.append("At-least One uppercase character required. \n");
                validPassword = false;
            }

            if (!newPassword.matches(".*[^a-zA-Z0-9].*")) {
                passwordErrors.append("Special character required. \n ");
                validPassword = false;
            }

            if (newPassword.equals(Answer.currentPassword)) {
                passwordErrors.append("Can't reuse old password.\n");
                validPassword = false;
            }

            if (newPassword.contains(Answer.username)) {
                passwordErrors.append("Password cannot contain username:");
                validPassword = false;
            }

            if (validPassword) {
                System.out.println("Password met all criteria");
                return true;
            }
            passwordErrors.append(" :Please Try again: ");
            System.out.println(passwordErrors);
            newPassword = scanner.nextLine();
        }

    }

}
