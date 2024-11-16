package homework.playground.essence.creatures;

public abstract class Vertebrata extends Animal {

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat(Insect food) {
        System.out.println(String.format("I am %s and I am eating %s", name, food.getName()));
    }
}
