package homework.playground.essence.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        Random random = new Random();
        int numberDirection = random.nextInt(39) + 1;
        String direction;
        if ((numberDirection >= 1) && (numberDirection <= 9)) {
            direction = "NORTH";
        } else if ((numberDirection >= 10) && (numberDirection <= 9)) {
            direction = "SOUTH";
        } else if ((numberDirection >= 20) && (numberDirection <= 29)) {
            direction = "WEST";
        } else {
            direction = "EAST";
        }
        return direction;
    }
}
