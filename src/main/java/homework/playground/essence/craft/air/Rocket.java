package homework.playground.essence.craft.air;

public class Rocket extends AirTransport {
    public Rocket(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.println("I'm " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I'm flying to " + direction);
    }
}
