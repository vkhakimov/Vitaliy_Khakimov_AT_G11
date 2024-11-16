package homework.playground.essence.craft.air;

import homework.playground.essence.Matter;

public abstract class AirTransport extends Matter {
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
