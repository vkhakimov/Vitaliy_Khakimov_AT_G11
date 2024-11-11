package bubbles;

import java.util.ArrayList;

public class SparklingWater extends Water {
    private Bubble[] bubbles;
    private ArrayList<Bubble> bubbleArrayList = new ArrayList<>();

    public SparklingWater(String color, double transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        this.bubbles = new Bubble[0];
    }

    public void pump(double volume) {
        bubbleArrayList.clear();
        for (int i = 0; i < (int) (volume * 10000); i++) {
            bubbleArrayList.add(new Bubble("CO2"));
        }

        this.bubbles = bubbleArrayList.toArray(new Bubble[0]);
    }

    public void degas() {
        for (int i = bubbleArrayList.size() - 1; i >= 0; i--) {
            if (i % 1000 == 0) {
                bubbleArrayList.get(i).cramp();
            }
            bubbleArrayList.remove(i);
        }
        this.bubbles = bubbleArrayList.toArray(new Bubble[0]);
        System.out.println("Degas completed.");
    }

    public void printBubbles() {
        System.out.println("Bubbles in SparklingWater: " + bubbles.length);
    }
}
