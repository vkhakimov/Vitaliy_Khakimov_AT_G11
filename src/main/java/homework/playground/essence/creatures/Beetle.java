package homework.playground.essence.creatures;

public class Beetle extends Insect {
    public Beetle(int mass, String name) {
        super(mass, name);
    }

    public void nest(Carrot home) {
        double familyMembers = (double) (this.getMass() / home.getMass());
        if (this.getMass() < home.getMass()) {
            System.out.println(String.format("I am %s and I will nest there with %s my family members!", name, familyMembers));
        } else {
            System.out.println("This carrot is too small for nesting :(");
        }
    }
}
