package encapsulatingclass;

/**
 * This class represents a customer of the clothing shop.
 */
public final class Customer {
    private final String name;
    private final String ssn;

    /**
     * Constructs a Customer object with the given name and ssn.
     *
     * @param name The customer's name.
     * @param ssn  The customer's social security number.
     */
    public Customer(final String name, final String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    /**
     * Returns the customer's name.
     *
     * @return The customer's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the customer's ssn.
     *
     * @return The customer's ssn.
     */
    public String getSsn() {
        return ssn;
    }
}
