package homework.day7;

import homework.day7.task01.Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task13 {
    public static void main(String[] args) {
        List<Water> water = new ArrayList<>(Arrays.asList(new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"), new Water("Мутная", "Аммиачный")));

        System.out.println("===============================================");
        System.out.println("Color - Smell:");
        for (Water w : water) {
            System.out.println(w.getColor() + " - " + w.getSmell());
        }
    }
}
