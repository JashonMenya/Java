package collectionsinjava.mylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * ArrayList class.
 */
public final class MyList {
    private MyList() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */
    @SuppressWarnings("rawtypes")
    public static void main(final String[] args) {
        List arrayList = new ArrayList();
        System.out.println("ArrayList class: " + arrayList.getClass());

        System.out.println("ArrayList instance List: "
                + (arrayList instanceof List));
        System.out.println("ArrayList instance Collection: "
                + (arrayList instanceof Collection));
        System.out.println("ArrayList instance Iterable: "
                + (arrayList instanceof Iterable));

    }
}
