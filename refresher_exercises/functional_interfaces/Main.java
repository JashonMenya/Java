package refresher_exercises.functional_interfaces;

import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List countries = List.of("Tanzania", "USA", "China");

        Consumer print = c -> System.out.println(c);
        countries.forEach(print);

        print.accept("Hello World");

    }
}
