package refresher_exercises.data_structures;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits.get(3));

        fruits.set(2, "grape");
        System.out.println(fruits);

        fruits.add("lemon");
        System.out.println(fruits);

        System.out.println("Index of first lemon " + fruits.indexOf("lemon"));
        System.out.println("Index of last lemon " + fruits.lastIndexOf("lemon"));

        fruits.remove(4);
        System.out.println(fruits);

        List moreFruits = List.of("cherry", "cranberry");
        System.out.println("More fruits " + moreFruits);
    }
}
