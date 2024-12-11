package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = new ArrayList<>(Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля"));
        Arrays.stream(birds.stream().map(b -> b.replace("о", "а"))
                        .collect(Collectors.joining()).toLowerCase()
                        .replace("ь", "")
                        .split("б"))
                .map(b -> "--" + b + "--")
                .forEach(System.out::println);
    }
}
