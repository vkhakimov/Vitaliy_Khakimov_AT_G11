package homework.playground.essence.craft.air;

import homework.playground.essence.Flyable;
import homework.playground.essence.Matter;
import homework.playground.essence.craft.Transportable;

public abstract class AirTransport extends Matter implements Flyable, Transportable {
    protected String name;

    public AirTransport(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I am moving from " + pointA + " to " + pointB);
        return pointB - pointA;
    }
}
