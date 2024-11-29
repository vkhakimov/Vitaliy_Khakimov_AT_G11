package homework.day7;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        int charSum = 0;
        System.out.println("===============================================");
        System.out.println("Cities list:");
        for (String city : cities) {
            System.out.println(city);
            charSum += city.length();
        }

        System.out.println("===============================================");
        System.out.println("Sum of all characters: " + charSum);

        System.out.println("===============================================");
        System.out.println("Cities list in a row:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }
    }
}
