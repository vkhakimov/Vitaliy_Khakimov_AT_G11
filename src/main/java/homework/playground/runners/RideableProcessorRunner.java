package homework.playground.runners;

import homework.playground.essence.craft.Rideable;
import homework.playground.essence.craft.ground.Car;
import homework.playground.essence.craft.ground.Moped;
import homework.playground.essence.craft.ground.Motorbike;
import homework.playground.essence.craft.ground.Vehicle;
import homework.playground.processors.RideableProcessor;

public class RideableProcessorRunner {
    public static void main(String[] args) {
        RideableProcessor rideable = new RideableProcessor();

        Rideable rideableCar = new Car(223, "Lada Rideable");
        Rideable rideableMoped = new Moped(3452, "Honda EM1 837 Rideable");
        Rideable rideableMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Rideable");
        Vehicle vehicleCar = new Car(223, "Lada Vehicle");
        Vehicle vehicleMoped = new Moped(3452, "Honda EM1 837 Vehicle");
        Vehicle vehicleMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Vehicle");
        Car aCar = new Car(223, "Lada Car");
        Moped aMoped = new Moped(3452, "Honda EM1 837 Moped");
        Motorbike aMotorbike = new Motorbike(7623, "Suzuki GSX-R1000 Motorbike");

        Vehicle anonymousVehicle = new Vehicle(3452, "Honda EM1 837 Vehicle") {
            @Override
            public void drive(String direction) {
                System.out.println("I am " + this.getClass().getSimpleName() + ", my name is " + this.getName() + " and I amd driving to " + direction);
            }
        };

        Rideable anonymousRideable = new Rideable() {
            String name = "Anonymous";

            @Override
            public void drive(String direction) {
                System.out.printf("I am %s, my name is %s and I amd drive to %s%n",
                        this.getClass().getSimpleName(), this.name, direction);
            }
        };

        rideable.runRideable(rideableCar);
        rideable.runRideable(rideableMoped);
        rideable.runRideable(rideableMotorbike);
        rideable.runRideable(vehicleCar);
        rideable.runRideable(vehicleMoped);
        rideable.runRideable(vehicleMotorbike);
        rideable.runRideable(aCar);
        rideable.runRideable(aMoped);
        rideable.runRideable(aMotorbike);
        rideable.runRideable(anonymousVehicle);
        rideable.runRideable(anonymousRideable);

        rideable.runRideable(aCar, "EVERYWHERE");
        rideable.runRideable(aMoped, "NOWHERE");

    }
}
