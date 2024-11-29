package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        int i = 0;
        System.out.println("===============================================");
        System.out.println("Butterflies list:");
        for (String butterfly : butterflies) {
            System.out.print("\"" + butterfly + "\" ");
            if (butterfly.contains("o")) {
                i++;
            }
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Number of butterflies with \"o\" in name: " + i);

        System.out.println("===============================================");
        System.out.print("Butterflies list in row: ");
        for (int j = 0; j < butterflies.size(); j++) {
            System.out.print(butterflies.get(j) + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Butterflies list with \\n:");
        for (String butterfly : butterflies) {
            System.out.println(butterfly);
        }
        System.out.println("===============================================");
    }
}
