public final class Hello {
    private Hello() {
        // Private constructor to prevent instantiation
        throw new UnsupportedOperationException();
    }

    /**
     * Entry point of the program.
     *
     * @param args The command line arguments.
     */
    public static void main(final String[] args) {
        System.out.println("Hello Java");
    }
}
