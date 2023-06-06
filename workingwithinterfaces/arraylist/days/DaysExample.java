package workingwithinterfaces.arraylist.days;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Days example class.
 */
public final class DaysExample {

    private DaysExample() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {
        String[] days = {
                "monday", "tuesday", "wednesday",
                "thursday", "friday", "saturday", "sunday"
        };

        final ArrayList<String> daysList = convertToArrayList(days);

        printDays(daysList);
    }

    /**
     * Converts an array of strings to an ArrayList of strings.
     *
     * @param days The array of strings.
     * @return The ArrayList of strings.
     */
    public static ArrayList<String> convertToArrayList(final String[] days) {
        ArrayList<String> daysList = new ArrayList<>(Arrays.asList(days));
        return daysList;
    }

    /**
     * Prints the days of the week.
     *
     * @param daysList The list of days.
     */
    public static void printDays(final ArrayList<String> daysList) {
        for (String day : daysList) {
            if (day.equals("sunday")) {
                System.out.println(day.toUpperCase());
            } else {
                System.out.println(day);
            }
        }
    }
}
