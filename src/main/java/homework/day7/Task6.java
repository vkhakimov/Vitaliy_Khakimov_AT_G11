package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));
        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        int counter = 0;

        System.out.println("===============================================");
        System.out.println("List of birds:");
        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        for (String bird : birds) {
            int vowelCounter = 0;
            for (char ch : bird.toLowerCase().toCharArray()) {
                for (char vowel : vowels) {
                    if (vowel == ch) {
                        vowelCounter++;
                    }
                }
            }
            if (vowelCounter > 1) {
                counter++;
            }
        }

        System.out.println("===============================================");
        System.out.println("Number of birds with more than one vowel: " + counter);

        System.out.println("===============================================");
        System.out.print("List of birds: ");
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        birds.remove(2);
        birds.add(2, "Синица");

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Updated list of birds: ");
        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }
    }
}
