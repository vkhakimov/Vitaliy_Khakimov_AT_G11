package homework.playground.essence.creatures;

import homework.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {
    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.println("I'm " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I'm flying to " + direction);
    }
}
