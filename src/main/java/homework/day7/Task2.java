package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> figures = new ArrayList<>(Arrays.asList("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс"));

        int i = 0;
        int j = 0;
        System.out.println("===============================================");
        System.out.println("Figures list:");
        for (String figure : figures) {
            System.out.print(figure);
            i++;
            if (figures.size() != i) {
                System.out.print(" - ");
            }

            if (!figure.contains("и")) {
                j++;
            }
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Number of figures without \"и\" in name: " + j);

        System.out.println("===============================================");
        System.out.print("Figures list in row with space delimiter: ");
        for (int y = 0; y < figures.size(); y++) {
            System.out.print(figures.get(y) + " ");
        }

        figures.add(2, "Треугольник");
        System.out.println("===============================================");
        System.out.print("New figures list in row with space delimiter: ");
        for (String figure : figures) {
            System.out.print(figure + " ");
        }
    }
}
