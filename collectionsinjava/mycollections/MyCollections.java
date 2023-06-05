package collectionsinjava.mycollections;

import java.util.ArrayList;
import java.util.Collection;

/**
 * A collection package.
 */
public final class MyCollections {
    private MyCollections() {
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

        Collection carCompanies = new ArrayList();
        carCompanies.add("Toyota");
        carCompanies.add("Honda");
        carCompanies.add("Ford");

        System.out.println("Car companies: " + carCompanies);

        carCompanies.add("General Motors");
        System.out.println("Car companies: " + carCompanies);

        carCompanies.add("Honda");
        System.out.println("Car companies: " + carCompanies);

        System.out.println("Number of car companies: " + carCompanies.size());

        carCompanies.remove("Honda");
        System.out.println("Car companies: " + carCompanies);

        // carCompanies.remove("Honda");
        // System.out.println("Car companies: " + carCompanies);
    }
}
