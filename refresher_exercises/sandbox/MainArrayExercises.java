package refresher_exercises.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainArrayExercises {
    public static void main(String[] args) {
        EasyArrayExercises easyArrayExercises = new EasyArrayExercises();
        List<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int[] sampleArray = {1, 2, 3, 4, 5};

        int[] result = easyArrayExercises.rotateArr(sampleArray, 2);
        System.out.println((Arrays.toString(result)));
    }
}
