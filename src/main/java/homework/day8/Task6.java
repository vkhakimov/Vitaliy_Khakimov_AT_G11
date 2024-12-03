package homework.day8;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.countAndNewFile();
    }

    public void countAndNewFile() {
        String fileInPath = "./src/main/java/homework/day8/data/task6.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileInPath));

            String line;
            int sumCh = 0;
            while ((line = reader.readLine()) != null) {
                sumCh += line.length();
            }
            reader.close();

            String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
            String fileOutPath = String.format("%s_%d.txt", timestamp, sumCh);

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileOutPath, true));
            writer.write("Number of characters in file: " + sumCh);
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
