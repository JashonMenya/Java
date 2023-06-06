package inheritance.clothingshop;

/**
 * Main class.
 */
public final class Main {

    /**
     * The ID of the shirt item.
     */
    private static final int SHIRT_ITEM_ID = 20;
    /**
     * The description of the shirt item.
     */
    private static final String SHIRT_DESCRIPTION = "Relaxed Blue Polo";
    /**
     * The color code of the shirt item.
     */
    private static final char SHIRT_COLOR_CODE = 'B';
    /**
     * The price of the shirt item.
     */
    private static final double SHIRT_PRICE = 21.2;
    /**
     * The size of the shirt item.
     */
    private static final char SHIRT_SIZE = 'M';

    /**
     * Private constructor to prevent instantiation of the Main class.
     */
    private Main() {
        // This class should not be instantiated.
    }

    /**
     * Entry point of the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(final String[] args) {

        Shirt shirt01 = new Shirt(SHIRT_ITEM_ID, SHIRT_DESCRIPTION,
                SHIRT_COLOR_CODE, SHIRT_PRICE, SHIRT_SIZE);

        System.out.println(shirt01.toString());

    }

}
