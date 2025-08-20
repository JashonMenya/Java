package refresher_exercises.data_structures;

import java.util.*;

public class Maps {
    public static void main(String[] args) {

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 28);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 290); // overrides existing value
        fruitCalories.putIfAbsent("lemon", 26); // only adds if key does not exist

        fruitCalories.forEach((key, value) -> System.out.println(key + " : " + value));

        Collection values = fruitCalories.values();
        System.out.println(values);

    }
}
