package refresher_exercises;

public class CommandLineParameters {
    public static void main(String[] args) {

        if (args.length > 0) {
            System.out.println("Choose 1 to continue and 2 to exit");
            String selected = args[0];
            System.out.println( selected + "Has been selected");
            if (selected.equals("1")) {
                System.out.println("User chose to continue: ");
                // ToDo:
            } else {
                System.out.println("program shutting down in...");
            }

        }
        for (String argument : args) {
            System.out.println(argument);
        }
    }
}
