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
}
