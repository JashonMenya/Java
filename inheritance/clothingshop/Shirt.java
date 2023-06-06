package inheritance.clothingshop;

/**
 * Shirt class.
 */
public class Shirt extends Clothing {
    /**
     * The fit of the shirt.
     */
    private final char fit;

    /**
     * Constructor.
     *
     * @param itemId      The ID of the shirt.
     * @param description The description of the shirt.
     * @param colorCode   The color code of the shirt.
     * @param price       The price of the shirt.
     * @param fitArg      The fit of the shirt.
     */
    public Shirt(final int itemId, final String description,
            final char colorCode, final double price, final char fitArg) {
        super(itemId, description, colorCode, price);
        fit = fitArg;
    }

    /**
     * Get the fit of the shirt.
     *
     * @return The fit of the shirt.
     */
    public String getFit() {
        return "Fit: " + fit;
    }

    /**
     * Display the shirt details.
     *
     * @return The string representation of the shirt.
     */
    @Override
    public String toString() {
        return "Shirt{"
                + getId() + ", "
                + getDescription() + ", "
                + "color code: " + getColorCode() + ", "
                + getPriceAsString() + ", "
                + getFit()
                + '}';
    }
}
