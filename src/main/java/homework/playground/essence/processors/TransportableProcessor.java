package homework.playground.essence.processors;

import homework.playground.essence.craft.Transportable;
import homework.playground.essence.utils.CoordinatesGenerator;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + "  was moved to "
                + transportable.move(pointA, pointB) + " points");
    }

    public void runTransportable(Transportable transportable) {
        System.out.println("Transportable " + transportable.getClass().getSimpleName() + "  was moved to "
                + transportable.move(CoordinatesGenerator.generateCoordinate(), CoordinatesGenerator.generateCoordinate())
                + " points");
    }
}
