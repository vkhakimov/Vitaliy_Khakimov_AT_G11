package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();
        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

        System.out.println("===============================================");
        System.out.print("Noodles list: ");
        for (String noodle : noodles) {
            System.out.print(noodle + " ");
        }


        for (int i = 0; i < noodles.size(); i++) {
            String updatedNoodle = noodles.get(i).replace('a', 'o');
            noodles.set(i, updatedNoodle);
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Updated noodles list: ");
        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }
    }
}
