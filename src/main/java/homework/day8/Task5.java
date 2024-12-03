package homework.day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        task5.chCounter();
    }

    public void chCounter() {
        String filePath = "./src/main/java/homework/day8/data/task4.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            int sumCh = 0;
            while ((line = reader.readLine()) != null) {
                sumCh += line.length();
            }
            reader.close();
            System.out.println("Number of characters in file: " + sumCh);
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
