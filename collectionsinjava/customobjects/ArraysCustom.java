package collectionsinjava.customobjects;

import java.util.Collection;
import java.util.ArrayList;

public final class ArraysCustom {
    private ArraysCustom() {
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

        carCompanies.add("BMW");
        carCompanies.add("Ford");

        final int carCompanyId = 5;
        final double fakeCompanyId = 6.5;
        carCompanies.add(carCompanyId);
        carCompanies.add(fakeCompanyId);

        System.out.println("Car companies list (with primitive types): "
                + carCompanies);

        System.out.println();

        carCompanies.add(new Company("Toyota", "Japan"));
        carCompanies.add(new Company("Honda", "Japan"));
        System.out.println("Car companies list (with custom objects): "
                + carCompanies);

    }
}
