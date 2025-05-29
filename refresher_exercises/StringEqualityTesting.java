package refresher_exercises;

public class StringEqualityTesting {
    public static void main(String[] args) {
        String firstPersonsName = "Brian";
        String secondPersonsName = "brian";

        caseDoesNotMatter(firstPersonsName, secondPersonsName);

        String pleaseRepeatThis = "Double... ";
        String repeated = repeatString(pleaseRepeatThis, 3);
        System.out.println(repeated);

        String mightBeEmpty = "The quick brown fox jumps over the lazy dog";
        if (mightBeEmpty.length() == 0) {
            System.out.println("This is an empty String");
        } else if (mightBeEmpty.length() > 0) {
            System.out.println("We've got some data... printing it out in 3,2,1...: \n");
            System.out.println(mightBeEmpty);

        }

    }

    public static void caseMustMatch(String firstString, String seconString) {
        if (firstString.equals(seconString)) {
            System.out.println("The names match");
        } else {
            System.out.println("The names Do NOT match");
        }
    }

    public static void caseDoesNotMatter(String firstString, String seconString) {
        if (firstString.equalsIgnoreCase(seconString)) {
            System.out.println("The names match: case does not matter");
        } else {
            System.out.println("The names Do NOT match");
        }
    }

    public static String repeatString(String input, int numberOfTimes) {
        return input.repeat(numberOfTimes);
    }
}
