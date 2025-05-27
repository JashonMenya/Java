package refresher_exercises;

public class Concatination {
    public static void main(String[] args) {
        String greetings = "Hello";
        if (greetings.length() > 0) {
            System.out.println("Incoming greeting...");
            greetings = greetings.substring(0, 3) + "p!";

            char grabbed_char = greetings.charAt(0);
            System.out.println("Grabbed character is: " + grabbed_char);
        }

        StringBuilder builder = new StringBuilder();
        String name = "Brian";
        builder.append("Hello " + name);
        System.out.println(builder);

        System.out.println(greetings);
    }
}
