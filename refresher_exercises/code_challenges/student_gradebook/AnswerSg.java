package refresher_exercises.code_challenges.student_gradebook;


import java.util.HashMap;
import java.util.Map;

class AnswerSg {

    public  static void  main(String[] args ) {

        var grades = new HashMap<String, Integer>();
        grades.put("Isaac", 95);
        grades.put("Hannah", 55);
        grades.put("Charlie", 80);
        grades.put("Alice", 24);
        grades.put("Bob", 32);
        grades.put("Jane", 63);
        grades.put("Daniel", 50);
        grades.put("Grace", 59);
        grades.put("Frank", 40);
        grades.put("Eve", 79);


        var makeupGrades = new HashMap<String, Integer>();
        makeupGrades.put("Isaac", 90);
        makeupGrades.put("Hannah", 95);
        makeupGrades.put("Charlie", 76);
        makeupGrades.put("Alice", 97);
        makeupGrades.put("Bob", 82);
        makeupGrades.put("Jane", 62);
        makeupGrades.put("Daniel", 89);
        makeupGrades.put("Grace", 80);
        makeupGrades.put("Frank", 98);
        makeupGrades.put("Eve", 79);


        Map<String, Integer> finalGrages = updateGrades(grades, makeupGrades);
        finalGrages.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

    }


    static Map<String, Integer> updateGrades(Map<String, Integer> gradebook, Map<String, Integer> makeupGrades) {

        // TODO: Update gradebook entry if the makeup grade is better
        gradebook.forEach((k, v) -> {
            String currentStrudent = k;

            //compare grades of current student and only update it if the new one is higher
            if (makeupGrades.get(currentStrudent) > v) {
                gradebook.put(currentStrudent, makeupGrades.get(currentStrudent));
            }
        });

        return gradebook;
    }
}
