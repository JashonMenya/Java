package refresher_exercises.code_challenges.unauthorized_user;

// Java code​​​​​​‌‌‌​​​​‌​​‌​‌​‌‌​‌‌​​‌​​‌ below
/***************************************************
 Write your answer here, and then test your code.
 Your job is to implement the checkAccess() method.
 ****************************************************/

import java.util.List;

class AnswerUnauthorizedUserException {
    public static void main(String[] args) throws UnauthorizedException {
        checkAccess("cloudSurfer55");
    }

    static List<String> authorizedUsers = List.of("techwizard87", "codeNinja123", "dataQueen99", "cyberPioneer",
            "byteMaster", "algorithmGuru", "cloudSurfer55", "pixelPilot", "javaJedi", "scriptScribe");
    static String accessDeniedMessage = "Access denied";

    static void checkAccess(String username) throws UnauthorizedException {
        /*******************************************************
         * TODO: Your code goes here.
         * 
         * Implement this method to throw an UnauthorizedException
         * if the provided username is not in the authorizedUsers
         * list. Use accessDeniedMessage as the exception's message
         ********************************************************/

        if (!authorizedUsers.contains(username)) {
            throw new UnauthorizedException(accessDeniedMessage);
        } else {
            System.out.println(username + "is currently Logged in");
        }

    }
}

// Do not change this class
class UnauthorizedException extends Exception {
    public UnauthorizedException() {
        this("Unauthorized to access");
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
