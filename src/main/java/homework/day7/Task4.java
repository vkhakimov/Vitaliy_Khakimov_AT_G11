package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди"));

        System.out.println("===============================================");
        System.out.println("List of cars:");
        for (String car : cars) {
            System.out.println("\"" + car + "\"");
        }

        cars.removeIf(car -> car.length() > 4);

        System.out.println("===============================================");
        System.out.println("Updated list of cars:");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
