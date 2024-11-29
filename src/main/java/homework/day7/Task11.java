package homework.day7;

import homework.day7.task01.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task11 {
    public static void main(String[] args) {
        List<Bubble> bubbles = new ArrayList<>(Arrays.asList(new Bubble(2, "CO2"),
                new Bubble(4, "O2"), new Bubble(5, "CO")));
        int sumVol = 0;

        System.out.println("===============================================");
        System.out.print("Volumes: ");
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getVolume() + " ");
            sumVol += bubble.getVolume();
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Names: ");
        for (Bubble bubble : bubbles) {
            System.out.print(bubble.getName() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Sum volume: " + sumVol);

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Bubbles toString(): ");
        for (int i = 0; i < bubbles.size(); i++) {
            System.out.println(bubbles.toString());
        }
    }
}
