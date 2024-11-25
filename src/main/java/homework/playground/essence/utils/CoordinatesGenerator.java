package homework.playground.essence.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        Random random = new Random();
        int coordinates = random.nextInt(79) + 1;
        System.out.println("CoordinatesGenerator: I have generated point with value: " + coordinates);
        return coordinates;
    }
}
