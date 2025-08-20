package refresher_exercises.data_structures;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("berry");
        fruits.add("pineapple");
        fruits.add(1);

        List<String> myListOfFruits = List.copyOf(fruits);
        System.out.println(" myListOfFruits****" + myListOfFruits);

        System.out.println("Fruits available " + fruits);
        System.out.println("Has lemon? " + fruits.contains("lemon"));

        fruits.remove("berry");
        System.out.println("After removing berry " + fruits);

        System.out.println("No of fruits remaining " + fruits.size());

        // Becomes immutable. adding or removing will lead to an exception error
        // moreFruits.add("cranberry");
        // moreFruits.remove("pear");

        Set moreFruits = Set.of("pear", "raisin", "cherry");
        System.out.println(moreFruits);

        Set addingMoreFruits = Set.copyOf(moreFruits);
        System.out.println(addingMoreFruits);

    }
}
