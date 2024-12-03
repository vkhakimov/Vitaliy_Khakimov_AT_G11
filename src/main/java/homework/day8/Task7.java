package homework.day8;

import homework.playground.essence.creatures.Beetle;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();
        task7.objToFile();
    }

    public void objToFile() {
        Beetle beetle = new Beetle(1, "name");

        try {
            FileOutputStream fos = new FileOutputStream("task7.tmp");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(beetle);
            oos.close();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
