package homework.playground.essence.craft.ground;

public class Moped extends Vehicle {
    public Moped(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void drive(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I amd driving to " + direction);
    }
}
