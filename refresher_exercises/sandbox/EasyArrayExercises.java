package refresher_exercises.sandbox;

import java.util.Arrays;

public class EasyArrayExercises {
    /**
     * Given an array of positive integers arr[] of size n, the task is to find
     * second-largest distinct element in the array.
     *
     * Note: If the second-largest element does not exist, return -1.
     *
     *
     * arr[] = [12, 35, 1, 10, 34, 1]
     */

    public int secondLargest() {
        int[] numbers = { 12, 35, 1, 10, 34, 1 };
        // second largest = 34
        int largerstNumber = numbers[0];
        int secondLargestNum = numbers[0];

        for (int number : numbers) {
            if (number > largerstNumber) {
                secondLargestNum = largerstNumber;
                largerstNumber = number;
            } else if (number < largerstNumber && number > secondLargestNum) {
                secondLargestNum = number;
            }
        }

        return secondLargestNum;
    }

    public int secondLargestUsingSort() {
        int[] numbers = { 12, 35, 1, 10, 34, 3 };
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];

    }

    /**
     *
     * Given an array of n integers, the task is to find the third largest element.
     * All the elements in the array are distinct integers.
     *
     * Examples :
     *
     * Input: arr[] = {1, 14, 2, 16, 10, 20}
     * Output: 14
     * Explanation: Largest element is 20, second largest element is 16 and third
     * largest element is 14
     *
     * Input: arr[] = {19, -10, 20, 14, 2, 16, 10}
     * Output: 16
     * Explanation: Largest element is 20, second largest element is 19 and third
     * largest element is 16
     */

    public int thirdLargertElement() {
        int[] numbers = { 19, -10, 20, 14, 2, 16, 10 };

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            // get and assign largest
            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;
            } // get and assign the second largest
            else if (number > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;
            } // get and assign third
            else if (number > thirdLargest) {
                thirdLargest = number;
            }
        }

        return thirdLargest;
    }

}
