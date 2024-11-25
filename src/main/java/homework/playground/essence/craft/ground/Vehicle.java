package homework.playground.essence.craft.ground;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.Transportable;

public abstract class Vehicle extends Matter implements Transportable, Rideable {
    protected String name;

    public Vehicle(int mass, String name) {
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
