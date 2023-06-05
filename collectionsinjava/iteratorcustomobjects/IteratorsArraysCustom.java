package collectionsinjava.iteratorcustomobjects;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterators to iterate over the elements of the ArrayList.
 */
public final class IteratorsArraysCustom {
    private IteratorsArraysCustom() {
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
        Iterator carCompaniesIterator = carCompaniesIterable.iterator();
        while (carCompaniesIterator.hasNext()) {
            Company company = (Company) carCompaniesIterator.next();
            System.out.println("The next element is: " + company);
        }

    }
}
