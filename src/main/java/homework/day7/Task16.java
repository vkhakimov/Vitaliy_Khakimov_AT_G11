package homework.day7;

import java.util.HashMap;
import java.util.Map;

public class Task16 {
    public static void main(String[] args) {
        Map<Integer, String> elements = new HashMap<>();
        int uCounter = 0;

        elements.put(1, "Silicon");
        elements.put(2, "Sulfur");
        elements.put(3, "Argon");
        elements.put(4, "Calcium");
        elements.put(5, "Chromium");
        elements.put(6, "Iron");
        elements.put(7, "Zinc");

        System.out.println("===============================================");
        System.out.print("Elements values: ");
        for (String name : elements.values()) {
            System.out.print(name + " ");
        }

        for (String name : elements.values()) {
            for (char ch : name.toLowerCase().toCharArray()) {
                if (ch == 'u') {
                    uCounter++;
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("===============================================");
        System.out.print("Elements with \"U\" count: " + uCounter);

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry);
        }

        elements.replace(4, "Calcium", "Selenium");
        elements.remove(2);

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<Integer, String> entry : elements.entrySet()) {
            System.out.println(entry);
        }
    }
}
