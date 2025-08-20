package refresher_exercises.data_structures;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Iterators {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("berry");
        fruits.add("pineapple");

        var iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // advanced loop
        for (String fruit : fruits) {
            System.out.println(fruit);

        }

        // forEach
        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);

    }
}
