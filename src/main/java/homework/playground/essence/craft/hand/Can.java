package homework.playground.essence.craft.hand;

import homework.playground.essence.material.Pourable;

public class Can extends Container implements Storable {
    public Can(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void store(Pourable pourable, int amount) {
        System.out.println("I am " + this.getClass().getSimpleName() + ", my name is "
                + this.getName() + " and I received "
                + amount + " of "
                + pourable.getClass().getSimpleName());
        if (amount > this.mass) {
            System.out.println("waah-waah-waah-hh..");
        }
    }
}
