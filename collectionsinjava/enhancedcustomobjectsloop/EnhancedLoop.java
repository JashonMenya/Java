package collectionsinjava.enhancedcustomobjectsloop;

import java.util.ArrayList;

/**
 * Enhanced loop to iterate over the elements of the ArrayList.
 */
public final class EnhancedLoop {
    private EnhancedLoop() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(final String[] args) {
        ArrayList carCompanies = new ArrayList();

        carCompanies.add(new Company("Toyota", "Japan"));
        carCompanies.add(new Company("Honda", "Japan"));
        carCompanies.add(new Company("Ford", "USA"));

        Iterable carCompaniesIterable = (Iterable) carCompanies;

        for (Object object : carCompaniesIterable) {
            Company company = (Company) object;

            System.out.println("\nName: " + company.getName());
            System.out.println("Country: " + company.getCountry());

        }

    }
}
