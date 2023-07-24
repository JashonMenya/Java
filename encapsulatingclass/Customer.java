package encapsulatingclass;

/**
 * This class represents a customer of the clothing shop.
 */
public final class Customer {
    /**
     * The customer's name.
     */
    private final String name;

    /**
     * The customer's social security number (SSN).
     */
    private final String ssn;

    /**
     * Constructs a Customer object with the given name and SSN.
     *
     * @param customerName The customer's name.
     * @param customerSsn  The customer's social security number.
     */
    public Customer(final String customerName, final String customerSsn) {
        this.name = customerName;
        this.ssn = customerSsn;
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
     * Returns the customer's social security number (SSN).
     *
     * @return The customer's SSN.
     */
    public String getSsn() {
        return ssn;
    }
}
