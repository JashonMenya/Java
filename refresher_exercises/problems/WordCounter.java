package refresher_exercises.problems;

import java.util.Scanner;

public class WordCounter {

    /*
     * Write a program that counts the number of words in a string and prints each
     * one on a new line
     */
    public static void main(String args[]) {

        // Get user input
        String userInput = getUserInput();

        // Count number of words present

        int totalWords = numberOfWordsInInput(userInput);
        System.out.println(totalWords);

    }

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Sentence would you like counted today? ");
        String userInput = scanner.nextLine();
        while (userInput.isEmpty()) {
            System.out.print("Please type a valid sentence");
        }
        scanner.close();
        return userInput;
    }

    public static int numberOfWordsInInput(String userInput) {
        String[] words = userInput.split(" ");

        for (String word : words) {
            System.out.println(word + "\n");
        }

        System.out.println("Total word count is " + words.length);

        return words.length;

    }

}
