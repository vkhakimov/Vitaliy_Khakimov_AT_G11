package homework.day1.basetask;

public class Souse {
    private String name;
    private String color;

    public Souse(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouseDetails() {
        System.out.println("This is souse " + getName() + " and I'm " + getColor());
    }
}