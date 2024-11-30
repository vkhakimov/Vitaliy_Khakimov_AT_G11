package homework.day8;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        Task3 rewriter = new Task3();
        rewriter.vowelRemover();
    }

    public void vowelRemover() {
        String inFilePath = "./src/main/java/homework/day8/data/task3_in.txt";
        String outFilePath = "./src/main/java/homework/day8/data/task3_out.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFilePath));
            String line;
            line = reader.readLine();
            reader.close();

            String modifiedLine = line.replaceAll("[aeiouAEIOU]", "");
            writer.write(modifiedLine);
            System.out.println("Vowels removed successfully!");
            writer.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
