package refresher_exercises;

public class StringFormatting {
    public static void main(String[] args) {

        String name = "Daniel";
        int age = 10;
        boolean isIt = true;
        String message = String.format("Hello, %s. Next year, you'll be %d: %b", name, age, isIt);

        System.out.println(message);
    }
}
