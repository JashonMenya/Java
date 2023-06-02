package collectionsinjava.customobjects;

/**
 * Represents a company.
 */
public final class Company {
    /**
     * The name of the company.
     */
    private String name;

    /**
     * The country of the company.
     */
    private String country;

    /**
     * Constructor.
     *
     * @param companyName    The name of the company.
     * @param companyCountry The country of the company.
     */
    public Company(final String companyName, final String companyCountry) {
        name = companyName;
        country = companyCountry;
    }

    /**
     * Get the name of the company.
     *
     * @return The name of the company.
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the company.
     *
     * @param companyName The name of the company.
     */
    public void setName(final String companyName) {
        name = companyName;
    }

    /**
     * Get the country of the company.
     *
     * @return The country of the company.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Set the country of the company.
     *
     * @param companyCountry The country of the company.
     */
    public void setCountry(final String companyCountry) {
        country = companyCountry;
    }

    /**
     * Returns a string representation of the company.
     *
     * @return A string representation of the company.
     */
    public String toString() {
        return "Company [name=" + name + ", country=" + country + "]";
    }
}
