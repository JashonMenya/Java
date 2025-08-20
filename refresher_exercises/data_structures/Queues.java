package refresher_exercises.data_structures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();

        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        System.out.println(fruits);

        // fruits.add("lemon");
        System.out.println(fruits);

        var removed = fruits.remove();
        System.out.println("removed fruit " + removed);
        System.out.println(fruits);

        System.out.println("Head of queue " + fruits.peek());

    }
}
