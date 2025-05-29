package refresher_exercises;

public class RelationalBooleanOperators {
    public static void main(String[] args) {

        System.out.println("Ready to rock and roll...");

        // ternary ? operator
        int age = 15;
        String result = (age >= 18) ? "You can vote" : "You cannot vote";
        System.out.println(result);

        String all = String.join(" , ", "S", "M", "L", "XL");
        System.out.println(all);

        int number = 8;
        int i = 0;

        for (i = 0; i <= number; number--) {
            String repeat = "Looping ".repeat(number);
            System.out.println(repeat);
        }

    }
}
