package encapsulating_class;

/**
 * This class represents a customer of the clothing shop.
 */
public class Customer {
    private String name;
    private String ssn;

    // Encapsulate this class and make ssn read-only.

    // Add a constructor that takes a name and ssn.
    public Customer(String n, String s) {
        name = n;
        ssn = s;
    }

    /*
     * Add a method that returns the customer's name.
     */
    public String getName() {
        return name;
    }

    /*
     * Add a method that sets the customer's name.
     */
    public void setName(String n) {
        name = n;
    }

    /*
     * Add a method that returns the customer's ssn.
     */
    public String getSsn() {
        return ssn;
    }
}
