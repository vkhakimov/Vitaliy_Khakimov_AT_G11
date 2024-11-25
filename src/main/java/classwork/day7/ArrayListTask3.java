package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTask3 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("Black");
        colors.add("White");
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
        colors.add(2, "Pink");
        colors.add(4, "Yellow");
        for (String color : colors) {
            System.out.print(color + " ");
        }

        System.out.println();
        System.out.print(colors.get(1) + " " + colors.get(5));
    }
}
