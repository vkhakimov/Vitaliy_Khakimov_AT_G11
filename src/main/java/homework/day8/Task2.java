package homework.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 writer = new Task2();
        writer.fileWrite();
    }

    public void fileWrite() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Input your string:");
            String incoming = input.nextLine();
            BufferedWriter out = new BufferedWriter(new FileWriter("./src/main/java/homework/day8/data/task2.txt"));
            out.write("Hello, I just got '" + incoming + "' from you!");
            out.close();
            System.out.println("String was written to file successfully");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
}
