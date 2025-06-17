package refresher_exercises;

public class ArraysRefresher {
    public static void main(String[] args) {
        int[] evenNumbers = { 2, 4, 6, 8, 10 };
        findElementPosition(evenNumbers, 4);
    }

    public static void printAllElementUsingForLoop(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void printAllElementUsingForEach(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    public static void printAllElementUsingDoWhile(int[] numbers) {
        int i = 0;
        do {
            System.out.println(numbers[i]);
            i++;
        } while (i < numbers.length);
    }

    public static void findElementInArray(int[] numbers) {
        for (int number : numbers) {
            if (number == 4) {
                System.out.println("Element exists");
                return;
            }

        }
    }

    public static void findElementPosition(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println("Element " + target + " found at position: " + i);
                return;
            }
        }
        System.out.println("Element not found.");
    }

}
