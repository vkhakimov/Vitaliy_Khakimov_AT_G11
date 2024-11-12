package project.bubbles.runners;

import project.bubbles.models.Bottle;
import project.bubbles.models.SparklingWater;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Bottle 0.5l:");
        SparklingWater sparklingWater1 = new SparklingWater("Transparent", 100.0, "No smell", 20.5);
        Bottle bottle1 = new Bottle(0.5, sparklingWater1);
        sparklingWater1.pump(bottle1.getVolume());
        sparklingWater1.bubblesCount();
        bottle1.open();
        sparklingWater1.bubblesCount();

        System.out.println();
        System.out.println("Bottle 1.0l:");
        SparklingWater sparklingWater2 = new SparklingWater("Transparent", 100.0, "No smell", 20.5);
        Bottle bottle2 = new Bottle(1.0, sparklingWater2);
        sparklingWater2.pump(bottle2.getVolume());
        sparklingWater2.bubblesCount();
        bottle2.open();
        sparklingWater2.bubblesCount();

        System.out.println();
        System.out.println("Bottle 1.5l:");
        SparklingWater sparklingWater3 = new SparklingWater("Transparent", 100.0, "No smell", 20.5);
        Bottle bottle3 = new Bottle(1.5, sparklingWater3);
        sparklingWater3.pump(bottle3.getVolume());
        sparklingWater3.bubblesCount();
        bottle3.open();
        sparklingWater3.bubblesCount();
    }
}
