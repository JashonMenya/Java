package refresher_exercises.sandbox;

public class ArrayEasy {
    /**
     * Given an array of positive integers arr[] of size n, the task is to find second-largest distinct element in the array.
     *
     * Note: If the second-largest element does not exist, return -1.
     *
     *
     * arr[] = [12, 35, 1, 10, 34, 1]
     */

    public int secondLargest() {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        // second largest = 34
        int largerstNumber = numbers[0];
        int secondLargestNum = numbers[0];

        for(int number : numbers) {
            if (number > largerstNumber) {
                secondLargestNum = largerstNumber;
                largerstNumber = number;
            }else if (number < largerstNumber && number > secondLargestNum) {
                secondLargestNum = number;
            }
        }

        return secondLargestNum;
    }
}
