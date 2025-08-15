package refresher_exercises.problems;

/**
 * Write a method that prints a given string backwards.
 *
 * Example: for the word stop, it prints pots
 */
public class reverseWord {
    public static void main(String[] args) {

        reverser("stop");

    }

    public static void reverser(String word) {
        for(int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
