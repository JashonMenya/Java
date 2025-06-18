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

    /**
     *
     * Given an integer array, find a maximum product of a triplet in the array.
     *
     * Examples:
     *
     * Input: arr[ ] = [10, 3, 5, 6, 20]
     * Output: 1200
     * Explanation: Multiplication of 10, 6 and 20
     *
     * Input: arr[ ] = [-10, -3, -5, -6, -20]
     * Output: -90
     *
     * Input: arr[ ] = [1, -4, 3, -6, 7, 0]
     * Output: 168
     *
     */

    public int maximumProductOfTriplet() {
        int[] numbers = { 1, -4, 3, -6, 7, 0 };
        // assign/get the 3 largest numbers
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        // assign/get 2 lowest numbers( in case of 2 negative numbers needed for product
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int number : numbers) {
            // largest number
            if (number > max1) {
                max3 = max2;
                max2 = max1;
                max1 = number;
            }
            // second largest
            else if (number > max2) {
                max3 = max2;
                max2 = number;
            } else if (number > max3) {
                max3 = number;
            }

            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2) {
                min2 = number;
            }
        }

        int allPositiveReturn = max1 * max2 * max3;
        int negativesIncluded = (min1 * min2) * max1;

        return Math.max(allPositiveReturn, negativesIncluded);
    }

    /**
     *
     * Given an array arr[] consisting of only 0's and 1's, the task is to find the
     * count of a maximum number of consecutive 1's or 0's present in the array.
     *
     * Examples :
     *
     * Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
     * Output: 4
     * Explanation: The maximum number of consecutive 1's in the array is 4 from
     * index 8-11.
     *
     * Input: arr[] = {0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}
     * Output: 2
     * Explanation: The maximum number of consecutive 0's in the array is 2 from
     * index 0-1.
     *
     * Input: arr[] = {0, 0, 0, 0}
     * Output: 4
     * Explanation: The maximum number of consecutive 0's in the array is 4.
     */

    public String maxConsecutive(int[] input) {
        int counter = 0;
        int highestCount = 0;
        int currentElement = -1;
        int winningElementValue = -1;

        // 1
        for (int number : input) {
            if (number == currentElement) {
                counter += 1;
            } else {
                counter = 1;
                currentElement = number;
            }

            // next logic
            if (counter > highestCount) {
                highestCount += 1;
                winningElementValue = number;
            }

        }

        return "The maximum number of consecutive " + winningElementValue + "'s in the array is:" + highestCount;
    }

}
