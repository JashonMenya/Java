package refresher_exercises.objects_classes;

/*
 * Click `Run` to execute the snippet below!
 */

// import java.io.*;
import java.util.*;
import java.util.Random;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
    public static void main(String[] args) {

        BingoCard result = Answer.getBingoCard();
    }

}

class Answer {

    static BingoCard getBingoCard() {

        /***************************************************
         * TODO: Your code goes here.
         * Implement this method to create a BingoCard object
         * that contains arrays for B, I, N, G, O.
         *
         * B: 5 numbers between 1 and 15
         * I: 5 numbers between 16 and 30
         * N: 4 numbers between 31 and 45
         * G: 5 numbers between 46 and 60
         * O: 5 numbers between 61 and 75
         ***************************************************/

        int[] bNumbers = generateColumn(1, 15);
        int[] iNumbers = generateColumn(16, 30);
        int[] nNumbers = generateColumn(31, 45);
        nNumbers[2] = 0;
        int[] gNumbers = generateColumn(46, 60);
        int[] oNumbers = generateColumn(61, 75);

        BingoCard bingoCard = new BingoCard(bNumbers, iNumbers, nNumbers, gNumbers, oNumbers);
        bingoCard.printCard();

        return bingoCard;

    }

    /***************************************************
     * Implement this method to create an array of 5 unique
     * integers within the range of the parameters: min
     * and max. Return the array.
     ***************************************************/
    private static int[] generateColumn(int min, int max) {

        Random random = new Random();
        int count = 0;
        int entries = 5;
        // TODO: Initialize an array here
        int[] currentColumn = new int[5];

        while (count < entries) {
            int number = min + random.nextInt(max - min + 1);

            // TODO: Change condition to call elementExists()
            if (true) {
                if (!elementExists(currentColumn, number)) {
                    // TODO: Add number to array
                    currentColumn[count] = number;
                    count++;
                }

            }
        }

        // TODO: Change statement below to return an array
        return currentColumn;
    }

    // Do not edit this method
    private static boolean elementExists(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }
}

class BingoCard {
    private int[] b, i, n, g, o;

    public BingoCard(int[] b, int[] i, int[] n, int[] g, int[] o) {
        setB(b);
        setI(i);
        setN(n);
        setG(g);
        setO(o);
    }

    public void setB(int[] numbers) {
        b = numbers;
    }

    public void setI(int[] numbers) {
        i = numbers;
    }

    public void setN(int[] numbers) {
        n = numbers;
    }

    public void setG(int[] numbers) {
        g = numbers;
    }

    public void setO(int[] numbers) {
        o = numbers;
    }

    public int[] getB() {
        return b;
    }

    public int[] getI() {
        return i;
    }

    public int[] getN() {
        return n;
    }

    public int[] getG() {
        return g;
    }

    public int[] getO() {
        return o;
    }

    public void printCard() {

        System.out.println(" \nB  I  N  G  O");
        for (int row = 0; row < 5; row++) {
            System.out.printf("%2d %2d %2d %2d %2d%n", b[row], i[row], n[row], g[row], o[row]);
        }
    }
}
