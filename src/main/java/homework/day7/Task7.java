package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        int counter = 0;
        List<String> elements = new ArrayList<>();
        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        System.out.println("===============================================");
        System.out.print("List of elements: ");
        for (String element : elements) {
            System.out.print(element + " ");
            String[] parts = element.split("\\s|-");
            if (parts.length > 1) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Number of elements with more than one word in name: " + counter);

        System.out.println();
        System.out.println("===============================================");
        System.out.print("List of elements: ");
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        elements.add(3, "Spinner");
        elements.remove(1);
        elements.remove(4);
        elements.add(4, "Switch");

        System.out.println("===============================================");
        System.out.print("Updated list of elements: ");
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
