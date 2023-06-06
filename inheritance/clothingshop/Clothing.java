package inheritance.clothingshop;

/**
 * Clothing class.
 */
public class Clothing {
    /**
     * The ID of the clothing item.
     */
    private final int itemId;
    /**
     * The description of the clothing item.
     */
    private final String description;
    /**
     * The color code of the clothing item.
     */
    private final char colorCode;
    /**
     * The price of the clothing item.
     */
    private final double price;

    /**
     * Constructor for the Clothing class.
     *
     * @param itemIdArg      The ID of the clothing item.
     * @param descriptionArg The description of the clothing item.
     * @param colorCodeArg   The color code of the clothing item.
     * @param priceArg       The price of the clothing item.
     */
    public Clothing(final int itemIdArg, final String descriptionArg,
            final char colorCodeArg, final double priceArg) {
        itemId = itemIdArg;
        description = descriptionArg;
        colorCode = colorCodeArg;
        price = priceArg;
    }

    /**
     * Display information about the clothing item.
     */
    public void displayClothing() {
        System.out.println("Clothing");
    }

    /**
     * Get the size of the clothing item.
     */
    public void getSize() {
        System.out.println("One size fits all");
    }

    /**
     * Get the color of the clothing item.
     */
    public void getColor() {
        System.out.println("White");
    }

    /**
     * Get the ID of the clothing item.
     *
     * @return The ID of the clothing item.
     */
    public int getId() {
        return itemId;
    }

    /**
     * Get the description of the clothing item.
     *
     * @return The description of the clothing item.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the price of the clothing item.
     *
     * @return The price of the clothing item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get the color code of the clothing item.
     *
     * @return The color code of the clothing item.
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * Get the price of the clothing item as a formatted string.
     *
     * @return The price of the clothing item as a formatted string.
     */
    public String getPriceAsString() {
        return "price: " + String.format("%.2f", getPrice());
    }
}
