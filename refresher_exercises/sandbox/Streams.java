package refresher_exercises.sandbox;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
        public static void main(String[] args) {
                int[] numbers = { 0, 2, 4, 6, 8, 10 };

                Arrays.stream(numbers)
                                .forEach(n -> System.out.println(n + 1 + " "));

                Arrays.stream(numbers).parallel()
                                .forEach(n -> System.out.println(n + 1 + " "));

                List<String> veggies = List.of(
                                "spinach",
                                "cabbage",
                                "peas",
                                "green beans",
                                "carrots",
                                "brussel sprouts",
                                "tomatoes");

                List veggiesStartingWithC = veggies.stream()
                                .filter(v -> v.startsWith("c"))
                                .collect(Collectors.toList());

                veggiesStartingWithC.forEach(System.out::println);
        }
}
