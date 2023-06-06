package workingwithinterfaces.tostring;

public final class Main {
    /**
     * Private constructor.
     */
    private Main() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {

        System.out.println(new Object());

        System.out.println(new StringBuilder("Test text"));

        System.out.println(new First());

    }

}
