package homework.day7;

import homework.day7.task01.Chair;

import java.util.*;

public class Task15 {
    public static void main(String[] args) {
        List<Chair> furniture = new ArrayList<>(Arrays.asList(new Chair(1, 2),
                new Chair(4, 2), new Chair(2, 4)));
        Map<Integer, Chair> chairMap = new HashMap<>();

        System.out.println("===============================================");
        System.out.println("Height * Width:");
        for (Chair chair : furniture) {
            System.out.println(chair.getHeight() * chair.getWidth());
        }

        for (int i = 0; i < furniture.size(); i++) {
            chairMap.put(i, furniture.get(i));
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Map keys:");
        for (int i : chairMap.keySet()) {
            System.out.println(i);
        }

        System.out.println("===============================================");
        System.out.println("Map values:");
        for (Chair chair : chairMap.values()) {
            System.out.println(chair);
        }

        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<Integer, Chair> chairEntry : chairMap.entrySet()) {
            System.out.println(chairEntry);
        }
    }
}
