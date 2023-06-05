package collectionsinjava.collections;

public final class ArraysAndCollections {
    private ArraysAndCollections() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        final int arraySize = 5;
        final int item1 = 10;
        final int item2 = 20;

        int[] intArray = new int[arraySize];

        intArray[0] = item1;
        intArray[1] = item2;

        printArray(intArray);
    }

    /**
     * Function printArray: Takes in an array and prints items in it.
     *
     * @param array The input array.
     */
    public static void printArray(final int[] array) {
        for (int i : array) {
            System.out.println("Item: " + i);
        }
    }
}
