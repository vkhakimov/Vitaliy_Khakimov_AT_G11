package homework.day6;

import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plain;
import homework.playground.essence.craft.air.Rocket;
import homework.playground.essence.craft.ground.Car;
import homework.playground.essence.craft.ground.Moped;
import homework.playground.essence.craft.ground.Motorbike;
import homework.playground.essence.craft.hand.Bottle;
import homework.playground.essence.craft.hand.Can;
import homework.playground.essence.craft.hand.Mug;
import homework.playground.essence.creatures.*;
import homework.playground.essence.material.Diesel;
import homework.playground.essence.material.Petrol;
import homework.playground.essence.material.Water;

public class GenericMethodsInGenericClassTRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassT<String> stringGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Integer> integerGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Double> doubleGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Copter> copterGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plain> plainGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Car> carGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Bottle> bottleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Beetle> beetleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Diesel> dieselGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGeneric = new GenericMethodsInGenericClassT<>();

        String str = "Hello world!";
        Integer intgr = 13;
        Double dbl = 5.16;
        System.out.println("--- String Generic ---");
        stringGeneric.genericMethodOneGenArg(str);
        System.out.println(stringGeneric.genericMethodTwoGenArgs(str, intgr));
        stringGeneric.genericMethodHalfGenArgs(str, "Test String");

        System.out.println("--- Integer Generic ---");
        integerGeneric.genericMethodOneGenArg(intgr);
        System.out.println(integerGeneric.genericMethodTwoGenArgs(intgr, dbl));
        integerGeneric.genericMethodHalfGenArgs(intgr, "Another Test");

        System.out.println("--- Double Generic ---");
        doubleGeneric.genericMethodOneGenArg(dbl);
        System.out.println(doubleGeneric.genericMethodTwoGenArgs(dbl, str));
        doubleGeneric.genericMethodHalfGenArgs(dbl, "Third Test");

        // Copter Generic
        System.out.println("--- Copter Generic ---");
        copterGeneric.genericMethodOneGenArg(new Copter(5, "A-45"));
        System.out.println(copterGeneric.genericMethodTwoGenArgs(new Copter(5, "A-45"), dbl));
        copterGeneric.genericMethodHalfGenArgs(new Copter(5, "A-45"), "Copter String");

        // Plain Generic
        System.out.println("--- Plain Generic ---");
        plainGeneric.genericMethodOneGenArg(new Plain(6, "747"));
        System.out.println(plainGeneric.genericMethodTwoGenArgs(new Plain(6, "747"), str));
        plainGeneric.genericMethodHalfGenArgs(new Plain(6, "747"), "Plain String");

        // Rocket Generic
        System.out.println("--- Rocket Generic ---");
        rocketGeneric.genericMethodOneGenArg(new Rocket(8, "falcon-9"));
        System.out.println(rocketGeneric.genericMethodTwoGenArgs(new Rocket(8, "falcon-9"), intgr));
        rocketGeneric.genericMethodHalfGenArgs(new Rocket(8, "falcon-9"), "Rocket String");

        // Car Generic
        System.out.println("--- Car Generic ---");
        carGeneric.genericMethodOneGenArg(new Car(2, "bmw"));
        System.out.println(carGeneric.genericMethodTwoGenArgs(new Car(2, "bmw"), dbl));
        carGeneric.genericMethodHalfGenArgs(new Car(2, "bmw"), "Car String");

        // Moped Generic
        System.out.println("--- Moped Generic ---");
        mopedGeneric.genericMethodOneGenArg(new Moped(1, "moped"));
        System.out.println(mopedGeneric.genericMethodTwoGenArgs(new Moped(1, "moped"), intgr));
        mopedGeneric.genericMethodHalfGenArgs(new Moped(1, "moped"), "Moped String");

        // Motorbike Generic
        System.out.println("--- Motorbike Generic ---");
        motorbikeGeneric.genericMethodOneGenArg(new Motorbike(1, "motorbike"));
        System.out.println(motorbikeGeneric.genericMethodTwoGenArgs(new Motorbike(1, "motorbike"), str));
        motorbikeGeneric.genericMethodHalfGenArgs(new Motorbike(1, "motorbike"), "Motorbike String");

        // Bottle Generic
        System.out.println("--- Bottle Generic ---");
        bottleGeneric.genericMethodOneGenArg(new Bottle(1, "bottle"));
        System.out.println(bottleGeneric.genericMethodTwoGenArgs(new Bottle(1, "bottle"), intgr));
        bottleGeneric.genericMethodHalfGenArgs(new Bottle(1, "bottle"), "Bottle String");

        // Can Generic
        System.out.println("--- Can Generic ---");
        canGeneric.genericMethodOneGenArg(new Can(1, "can"));
        System.out.println(canGeneric.genericMethodTwoGenArgs(new Can(1, "can"), str));
        canGeneric.genericMethodHalfGenArgs(new Can(1, "can"), "Can String");

        // Mug Generic
        System.out.println("--- Mug Generic ---");
        mugGeneric.genericMethodOneGenArg(new Mug(1, "mug"));
        System.out.println(mugGeneric.genericMethodTwoGenArgs(new Mug(1, "mug"), intgr));
        mugGeneric.genericMethodHalfGenArgs(new Mug(1, "mug"), "Mug String");

        // Beetle Generic
        System.out.println("--- Beetle Generic ---");
        beetleGeneric.genericMethodOneGenArg(new Beetle(1, "beetle"));
        System.out.println(beetleGeneric.genericMethodTwoGenArgs(new Beetle(1, "beetle"), str));
        beetleGeneric.genericMethodHalfGenArgs(new Beetle(1, "beetle"), "Beetle String");

        // Carrot Generic
        System.out.println("--- Carrot Generic ---");
        carrotGeneric.genericMethodOneGenArg(new Carrot(1, "carrot"));
        System.out.println(carrotGeneric.genericMethodTwoGenArgs(new Carrot(1, "carrot"), str));
        carrotGeneric.genericMethodHalfGenArgs(new Carrot(1, "carrot"), "Carrot String");

        // Chamomile Generic
        System.out.println("--- Chamomile Generic ---");
        chamomileGeneric.genericMethodOneGenArg(new Chamomile(1, "Chamomile"));
        System.out.println(chamomileGeneric.genericMethodTwoGenArgs(new Carrot(1, "Chamomile"), str));
        chamomileGeneric.genericMethodHalfGenArgs(new Chamomile(1, "Chamomile"), "Chamomile String");

        // Crocodile Generic
        System.out.println("--- Crocodile Generic ---");
        crocodileGeneric.genericMethodOneGenArg(new Crocodile(1, "Crocodile"));
        System.out.println(crocodileGeneric.genericMethodTwoGenArgs(new Crocodile(1, "Crocodile"), str));
        crocodileGeneric.genericMethodHalfGenArgs(new Crocodile(1, "Crocodile"), "Crocodile String");

        // Fly Generic
        System.out.println("--- Fly Generic ---");
        flyGeneric.genericMethodOneGenArg(new Fly(1, "Fly"));
        System.out.println(flyGeneric.genericMethodTwoGenArgs(new Fly(1, "Fly"), str));
        flyGeneric.genericMethodHalfGenArgs(new Fly(1, "Fly"), "Fly String");

        // Maylily Generic
        System.out.println("--- Maylily Generic ---");
        maylilyGeneric.genericMethodOneGenArg(new Maylily(1, "Maylily"));
        System.out.println(maylilyGeneric.genericMethodTwoGenArgs(new Fly(1, "Maylily"), str));
        maylilyGeneric.genericMethodHalfGenArgs(new Maylily(1, "Maylily"), "Maylily String");

        // Mosquito Generic
        System.out.println("--- Mosquito Generic ---");
        mosquitoGeneric.genericMethodOneGenArg(new Mosquito(1, "Mosquito"));
        System.out.println(mosquitoGeneric.genericMethodTwoGenArgs(new Mosquito(1, "Mosquito"), str));
        mosquitoGeneric.genericMethodHalfGenArgs(new Mosquito(1, "Mosquito"), "Mosquito String");

        // Pigeon Generic
        System.out.println("--- Pigeon Generic ---");
        pigeonGeneric.genericMethodOneGenArg(new Pigeon(1, "Pigeon"));
        System.out.println(pigeonGeneric.genericMethodTwoGenArgs(new Pigeon(1, "Pigeon"), str));
        pigeonGeneric.genericMethodHalfGenArgs(new Pigeon(1, "Pigeon"), "Pigeon String");

        // Potato Generic
        System.out.println("--- Potato Generic ---");
        potatoGeneric.genericMethodOneGenArg(new Potato(1, "Potato"));
        System.out.println(potatoGeneric.genericMethodTwoGenArgs(new Potato(1, "Potato"), str));
        potatoGeneric.genericMethodHalfGenArgs(new Potato(1, "Potato"), "Potato String");

        // Radish Generic
        System.out.println("--- Radish Generic ---");
        radishGeneric.genericMethodOneGenArg(new Radish(1, "Radish"));
        System.out.println(radishGeneric.genericMethodTwoGenArgs(new Radish(1, "Radish"), str));
        radishGeneric.genericMethodHalfGenArgs(new Radish(1, "Radish"), "Radish String");

        // Raven Generic
        System.out.println("--- Raven Generic ---");
        ravenGeneric.genericMethodOneGenArg(new Raven(1, "Raven"));
        System.out.println(ravenGeneric.genericMethodTwoGenArgs(new Raven(1, "Raven"), str));
        ravenGeneric.genericMethodHalfGenArgs(new Raven(1, "Raven"), "Raven String");

        // Rose Generic
        System.out.println("--- Rose Generic ---");
        roseGeneric.genericMethodOneGenArg(new Rose(1, "Rose"));
        System.out.println(roseGeneric.genericMethodTwoGenArgs(new Rose(1, "Rose"), str));
        roseGeneric.genericMethodHalfGenArgs(new Rose(1, "Rose"), "Raven Rose");

        // Diesel Generic
        System.out.println("--- Diesel Generic ---");
        dieselGeneric.genericMethodOneGenArg(new Diesel(1));
        System.out.println(dieselGeneric.genericMethodTwoGenArgs(new Diesel(1), intgr));
        dieselGeneric.genericMethodHalfGenArgs(new Diesel(1), "Diesel String");

        // Petrol Generic
        System.out.println("--- Petrol Generic ---");
        petrolGeneric.genericMethodOneGenArg(new Petrol(1));
        System.out.println(petrolGeneric.genericMethodTwoGenArgs(new Petrol(1), dbl));
        petrolGeneric.genericMethodHalfGenArgs(new Petrol(1), "Petrol String");

        // Water Generic
        System.out.println("--- Water Generic ---");
        waterGeneric.genericMethodOneGenArg(new Water(1));
        System.out.println(waterGeneric.genericMethodTwoGenArgs(new Water(1), str));
        waterGeneric.genericMethodHalfGenArgs(new Water(1), "Water String");
    }
}
