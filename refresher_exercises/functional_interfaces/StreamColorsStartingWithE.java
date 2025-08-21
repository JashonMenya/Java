package refresher_exercises.functional_interfaces;

import java.util.List;
import java.util.stream.Collectors;

public class StreamColorsStartingWithE {

    public static void main(String[] args) {

        List<String> colors = List.of("RED", "green", "blue", "pink", "black", "brown", "yellow", "purple", "orange",
                "white");
        List<String> result = Answer.filterColorsContainingE(colors);

        System.out.println(result);
    }

}

class Answer {

    /***************************************************
     * Change these boolean values to control whether you see
     * the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static List<String> filterColorsContainingE(List<String> colors) {
        /*
         * TODO: Use stream operations to filter the list of colors
         * into a new list that contains only the ones that contain
         * the letter 'e'.
         */

        return colors.stream()
                // .map(String::toLowerCase) updates output case
                .filter(color -> color.toLowerCase().contains("e")) // only checks for e as a lowercase no update
                .collect(Collectors.toList());
    }

}