package homework.playground.essence.material;

import homework.playground.essence.Matter;

public class Petrol extends Matter implements Pourable, Powerable {
    public Petrol(int mass) {
        super(mass);
    }

    @Override
    public void spread(String storeName) {
        System.out.println("I am " + this.getClass().getSimpleName() + " and I am spreading in " + storeName);
        System.out.println("wheeh..");
    }
}
