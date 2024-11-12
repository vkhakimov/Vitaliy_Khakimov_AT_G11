package project.bubbles.models;

public class Bubble {
    private final double VOLUME = 0.3;
    private String type;

    public Bubble(String type) {
        this.type = type;
    }

    public double getVOLUME() {
        return VOLUME;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void cramp() {
        System.out.println("Cramp");
    }
}
