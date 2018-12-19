package Practicals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
public class Main<sumPerColumn> {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws FileNotFoundException {
        // csv file to read
        String csvFile = "C:/Users/Gmick/Documents/ASSIGNMENT_3_DATA.csv";
        CSVReader.read(csvFile);

        Score grd = new Score();
       // char[] Arraylist=

        CSVReader reader = new CSVReader(new FileReader("ASSIGNMENT_3_DATA.csv"));
        String [] firstLine = CSVReader.read("ASSIGNMENT_3_DATA.csv");
        long sum = 0;
        for (String columnValue : firstLine) {
            try {
                sum += Long.parseLong(columnValue);
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(sum);
    }
    private static final int NUMBER_OF_COLUMNS = 2;

        Scanner lineScanner = new Scanner(Paths.get("C:/Users/Gmick/Documents/ASSIGNMENT_3_DATA.csv"));

        int[] sumPerColumn = new int[NUMBER_OF_COLUMNS];

        while (lineScanner.hasNextLine()) {
            String line = lineScanner.nextLine();
            String[] values = line.split(",");

            for (int col = 0; col < values.length; col++) {
                sumPerColumn[col] += Integer.parseInt(values[col]);
            }
        }

        System.out.println(sumPerColumn);
    }








