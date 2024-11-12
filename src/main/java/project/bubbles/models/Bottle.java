package project.bubbles.models;

public class Bottle {
    private double volume;
    private SparklingWater sparklingWater;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public SparklingWater getSparklingWater() {
        return sparklingWater;
    }

    public void setSparklingWater(SparklingWater sparklingWater) {
        this.sparklingWater = sparklingWater;
    }

    public Bottle(double volume, SparklingWater sparklingWater) {
        this.volume = volume;
        this.sparklingWater = sparklingWater;
    }

    public void open() {
        System.out.println("Bottle opened");
        sparklingWater.degas();
    }
}
