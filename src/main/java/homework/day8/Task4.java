package homework.day8;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.consonantRemover();
    }

    public void consonantRemover() {
        String filePath = "./src/main/java/homework/day8/data/task4.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String originalText = reader.readLine();
            reader.close();
            String updatedText = originalText.replaceAll("(?i)[bcdfghjklmnpqrstvwxyz]", "");

            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.newLine();
            writer.newLine();
            writer.write(updatedText);
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
