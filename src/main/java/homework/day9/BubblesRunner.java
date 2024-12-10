package homework.day9;


import homework.day7.task01.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BubblesRunner {
    public static void main(String[] args) {
        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO")));

        System.out.println(bubbles.stream().filter(b -> b.getVolume() > 3)
                .sorted(Comparator.comparing(bubble -> bubble.getName()))
                .map(bubble -> new Bubble(bubble.getVolume() * 3, bubble.getName()))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum());
    }
}
