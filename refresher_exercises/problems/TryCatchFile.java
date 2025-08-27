package refresher_exercises.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class TryCatchFile {
    public static void main(String[] args) throws IOException {

        Map<String, List> incomingData = readFile();
        System.out.println("incoming data : " + incomingData);

        System.out.println(incomingData);

    }

    public static String testingTryBlock() throws IOException {
        String msg = "";

        File file = new File("resources/nonexistent.txt");

        try {
            file.createNewFile();
        } catch (IOException ioException) {
            msg = msg + "Error Occured: " + ioException.getMessage();
            return msg;

        }

        return msg;
    }

    public static Map<String, List> readFile() {
        File file = new File("refresher_exercises/problems/data_file");
        List<Integer> intDataInFile = new ArrayList<>();
        List<Double> doubleDataInFile = new ArrayList<>();
        List<String> stringDataInFile = new ArrayList<>();

        Map<String, List> myData = new HashMap<>();
        myData.put("ints", intDataInFile);
        myData.put("doubles", doubleDataInFile);
        myData.put("strings", stringDataInFile);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    intDataInFile.add(scanner.nextInt());
                } else if (scanner.hasNextDouble()) {
                    doubleDataInFile.add(scanner.nextDouble());
                } else {
                    stringDataInFile.add(scanner.next());
                }
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("File was not found " + fnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }

        return myData;
    }
}
