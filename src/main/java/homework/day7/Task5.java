package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>(Arrays.asList("Андора", "Португалия", "Аглия", "Замбия"));

        int i = 0;
        int counter = 0;
        System.out.println("===============================================");
        System.out.println("List of counties:");
        for (String country : countries) {
            System.out.print(country);
            i++;
            if (countries.size() != i) {
                System.out.print(", ");
            }

            if (country.length() < 7) {
                counter++;
            }
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("List of countries with less than 7 letters: " + counter);

        System.out.println("===============================================");
        System.out.println("List of counties in new line:");
        for (int j = 0; j < countries.size(); j++) {
            System.out.println(countries.get(j));
        }
    }
}
