package collectionsinjava.testarraylist;

import java.util.ArrayList;

public final class TestArrayList {
    private TestArrayList() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */
    @SuppressWarnings({ "rawtypes" })
    public static void main(final String[] args) {
        ArrayList arrayList = new ArrayList();
        System.out.println("ArrayList class: " + arrayList.getClass());

        System.out.println(arrayList);
    }
}
