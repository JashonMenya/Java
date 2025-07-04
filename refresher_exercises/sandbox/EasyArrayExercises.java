package refresher_exercises.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasyArrayExercises {

    public int highestNo() {
        int firstNo = 9;
        int secondNo = 80;

        return Math.max(secondNo, firstNo);
    }

    /**
     * Given an array of integers, find the length of the longest increasing
     * consecutive sequence
     * Input: [1, 2, 2, 3, 4, 1, 2, 3, 4, 5]
     * Output: 5
     * The longest increasing sequence is: [1, 2, 3, 4, 5] → length = 5.
     * 
     * Input: [5, 4, 3, 2, 1]
     * Output: 1
     * (No increasing sequence, each number is smaller.)
     * 
     * Must handle empty arrays (return 0).
     * Must handle arrays with all equal elements (return 1).
     */

    public int longestIncreasingConsercutiveSequesnce(int[] numbers) {

        if (numbers.length == 0)
            return 0;
        int longestCount = 1;
        int currentCount = 1;

        // indexed for loop
        for (int i = 0; i < numbers.length - 1; i++) {
            // check for current and next element
            if (numbers[i] < numbers[i + 1]) {
                currentCount++;
                longestCount = Math.max(longestCount, currentCount);
            } else {
                currentCount = 1;
            }
        }
        return longestCount;

    }

    /**
     * Given an array of integers, return the sum of all the even numbers that are
     * immediately followed by an odd number.
     * 
     * Input: [2, 3, 4, 5, 6, 8, 9]
     * Output: 12
     * 
     * EXPLANATION
     * 2 (even) → followed by 3 (odd) → include 2
     * 
     * 4 (even) → followed by 5 (odd) → include 4
     * 
     * 6 (even) → followed by 8 (even) → skip
     * 
     * 8 (even) → followed by 9 (odd) → include 8
     */

    public int sumOfEvenNumImmediatelyFollowedByAnOddNum(int[] numbers) {
        // variable for sum
        int sum = 0;

        // check if its even then check if the element after is odd
        // indexed for loop
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 != 0) {
                System.out.println(numbers[i]);
                sum += numbers[i];
            }
        }

        return sum;
    }

    /**
     * Input: Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 ]
     * Output: Array: [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 50 ]
     * 
     * Add elements to an array
     */
    public int[] addElementsToArray(int[] initialArray, int itemToAdd) {
        // arrays have a fixed length. So create a new array
        int[] finalArray = new int[initialArray.length + 1];
        int elementPosition = 0;

        for (int number : initialArray) {
            finalArray[elementPosition] = number;
            elementPosition++;
        }

        if (elementPosition == initialArray.length) {
            finalArray[elementPosition] = itemToAdd;
        }

        return finalArray;
    }

    /**
     * Given an array of positive integers arr[] of size n, the task is to find
     * second-largest distinct element in the array.
     * Note: If the second-largest element does not exist, return -1.
     * 
     * arr[] = [12, 35, 1, 10, 34, 1]
     */

    public int secondLargest() {
        int[] numbers = {12, 35, 1, 10, 34, 1};
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
        int[] numbers = {12, 35, 1, 10, 34, 3};
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];

    }

    /**
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
        int[] numbers = {19, -10, 20, 14, 2, 16, 10};

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
     */

    public int maximumProductOfTriplet() {
        int[] numbers = {1, -4, 3, -6, 7, 0};
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

    /**
     * Given an array of integers arr[], the task is to move all the zeros to the
     * end of the array while maintaining the relative order of all non-zero
     * elements.
     * 
     * Examples:
     * 
     * Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
     * Output: arr[] = [1, 2, 4, 3, 5, 0, 0, 0]
     * Explanation: There are three 0s that are moved to the end.
     * 
     * Input: arr[] = [10, 20, 30]
     * Output: arr[] = [10, 20, 30]
     * Explanation: No change in array as there are no 0s.
     * 
     * Input: arr[] = [0, 0]
     * Output: arr[] = [0, 0]
     * Explanation: No change in array as there are all 0s.
     */

    // public int[] moveAllZeroesToEndOfList(int[] numbers) {
    // int counter = 0;
    // ArrayList<Integer> newArray = new ArrayList<Integer>();
    //
    // for(int elementPosition = 0; elementPosition < numbers.length;
    // elementPosition++) {
    //// System.out.println(numbers[elementPosition]);
    //
    // if (numbers[elementPosition] == 0) {
    // counter ++;
    // } else {
    // newArray.add(numbers[elementPosition]);
    // }
    //
    // }
    //
    //
    // System.out.println(newArray);
    //
    // int[] resp = {1, 2};
    // return resp;
    // }
    public int[] moveAllZeroesToEndOfList(int[] numbers) {
        int index = 0;

        // step one move all non zeros to the front
        for (int number : numbers) {
            if (number != 0) {
                numbers[index] = number;
                index++;
            }
        }
        // step two fill the rest with zeros
        while (index < numbers.length) {
            numbers[index] = 0;
            index++;
        }
        return numbers;
    }

    public int[] removeAllZeroes(int[] numbers) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int number : numbers) {
            if (number != 0) {
                resultList.add(number);
            }
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;

    }

    public List<Integer> reverseArray(List<Integer> a) {
        List<Integer> myNewList = new ArrayList<>();

        for (int i = a.size() - 1; i >= 0; i--) {
            myNewList.add(a.get(i));
            System.out.println(i);
        }

        myNewList.add(10, 0);

        return myNewList;
    }

}
