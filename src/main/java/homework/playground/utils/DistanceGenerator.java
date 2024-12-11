package homework.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance() {
        Random random = new Random();
        int distance = random.nextInt(99) + 1;
        System.out.println("DistanceGenerator: I have generated distance with value: " + distance);
        return distance;
    }
}
