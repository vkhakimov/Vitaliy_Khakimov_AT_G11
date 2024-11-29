package homework.day7;

import homework.day7.task01.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task14 {
    public static void main(String[] args) {
        List<Sand> sandbox = new ArrayList<>();

        sandbox.add(new Sand(2, "Речной"));
        sandbox.add(new Sand(4, "Речной"));
        sandbox.add(new Sand(2, "Карьерный"));
        sandbox.add(new Sand(7, "Речной"));

        System.out.println("===============================================");
        System.out.print("Weight: ");
        for (Sand sand : sandbox) {
            System.out.print(sand.getWeight() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Names: ");
        for (Sand sand : sandbox) {
            System.out.print(sand.getName() + " ");
        }

        Map<Integer, Sand> sandMap = new HashMap<>();
        for (int i = 0; i < sandbox.size(); i++) {
            sandMap.put(i, sandbox.get(i));
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Map keys:");
        for (int i : sandMap.keySet()) {
            System.out.println(i);
        }

        System.out.println("===============================================");
        System.out.println("Map values:");
        for (Sand sand : sandMap.values()) {
            System.out.println(sand);
        }

        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<Integer, Sand> sandEntry : sandMap.entrySet()) {
            System.out.println(sandEntry);
        }
    }
}
