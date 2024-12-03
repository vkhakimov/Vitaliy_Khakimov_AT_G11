package homework.day8;

import java.io.*;

public class Task8 {
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        task8.readObjFromFile();
    }

    public void readObjFromFile() {
        try {
            FileInputStream fis = new FileInputStream("task7.tmp");
            ObjectInputStream ois = new ObjectInputStream(fis);
            String objectFromFile = ois.readObject().toString();

            BufferedWriter writer = new BufferedWriter(new FileWriter("task8.txt", true));
            writer.write(objectFromFile);
            writer.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
