package refresher_exercises.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

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
        File outPutFile = new File("refresher_exercises/problems/output_file");
        List<Integer> intDataInFile = new ArrayList<>();
        List<Double> doubleDataInFile = new ArrayList<>();
        List<String> stringDataInFile = new ArrayList<>();

        Map<String, List> myData = new HashMap<>();
        myData.put("ints", intDataInFile);
        myData.put("doubles", doubleDataInFile);
        myData.put("strings", stringDataInFile);

        try (
                Scanner scanner = new Scanner(file);
                PrintWriter printWriter = new PrintWriter(outPutFile);

        ) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    intDataInFile.add(scanner.nextInt());
                } else if (scanner.hasNextDouble()) {
                    doubleDataInFile.add(scanner.nextDouble());
                } else {
                    stringDataInFile.add(scanner.next());
                }
            }
            writeToFile(myData, printWriter);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File was not found " + fnfe.getMessage());
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Exception occured: " + inputMismatchException.getMessage());
        } finally {

            System.out.println("This runs regardless...");
        }

        return myData;
    }

    public static void writeToFile(Map<String, List> incomingData, PrintWriter pr) {
        System.out.println(incomingData.get("int"));

        if (!incomingData.isEmpty()) {
            String firstKey = incomingData.keySet().iterator().next();
            List<String> firstList = incomingData.get(firstKey);
            if (!firstList.isEmpty()) {
                System.out.println("******" + firstList.get(0) + "*******");
            }
        }

        incomingData.forEach((key, value) -> {
            if (key.equals("strings")) {
                String joined = value.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining(" ")).toString();
                pr.println(joined);
            } else {
                for (Object val : value) {
                    pr.println(val);
                }
            }
        });

    }
}
