package homework.playground.essence.craft.ground;

public class Car extends Vehicle {
    public Car(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void drive(String direction) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I amd driving to " + direction);
    }
}
