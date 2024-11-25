package homework.day6;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.air.AirTransport;
import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plane;
import homework.playground.essence.craft.air.Rocket;
import homework.playground.essence.craft.ground.Car;
import homework.playground.essence.craft.ground.Moped;
import homework.playground.essence.craft.ground.Motorbike;
import homework.playground.essence.craft.ground.Vehicle;
import homework.playground.essence.craft.hand.Bottle;
import homework.playground.essence.craft.hand.Can;
import homework.playground.essence.craft.hand.Container;
import homework.playground.essence.craft.hand.Mug;
import homework.playground.essence.creatures.*;
import homework.playground.essence.material.Diesel;
import homework.playground.essence.material.Petrol;
import homework.playground.essence.material.Water;

public class GenericMethodsInGenericClassTwoParamsRunner {
    public static void main(String[] args) {
        GenericMethodsInGenericClassTwoParams<String, String> stringGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Integer> stringIntegerGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<String, Double> stringDoubleGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<AirTransport, Vehicle> airTransportVehicleGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Copter, Plane> copterPlainGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rocket, Copter> rocketCopterGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Car, Moped> carMopedGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Motorbike, Moped> motorbikeMopedGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Container, Vehicle> containerGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Bottle, Can> bottleCanGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mug, Can> mugCanGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Animal, Vehicle> animalVehicleGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Plant, Animal> plantAnimalGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Flower, Insect> flowerInsectGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Rose, Chamomile> roseChamomileGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Beetle, Fly> beetleFlyGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Carrot, Potato> carrotPotatoGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Crocodile, Maylily> crocodileMaylilyGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Mosquito, Pigeon> mosquitoPigeonGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Radish, Raven> radishRavenGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Vegetable, Vertebrata> vegetableVertebrataGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Diesel, Petrol> dieselPetrolGeneric = new GenericMethodsInGenericClassTwoParams<>();
        GenericMethodsInGenericClassTwoParams<Petrol, Water> petrolWaterGeneric = new GenericMethodsInGenericClassTwoParams<>();

        GenericMethodsInGenericClassTwoParams<Matter, Animal> matterAnimalGeneric = new GenericMethodsInGenericClassTwoParams<>();

        String str = "Hello world!";
        Integer intgr = 13;
        Double dbl = 5.16;
        System.out.println("--- String Generic ---");
        System.out.println(stringGeneric.genericMethodGenArgs(str));
        System.out.println(stringGeneric.genericMethodGenArgs(str, str));
        stringGeneric.genericMethodHalfGenArgs(str, "Test String 1");
        stringGeneric.genericMethodHalfGenArgs(str, "Test String 2", "Test String 3");

        System.out.println("--- String Integer Generic ---");
        System.out.println(stringIntegerGeneric.genericMethodGenArgs(str));
        System.out.println(stringIntegerGeneric.genericMethodGenArgs(str, intgr));
        stringIntegerGeneric.genericMethodHalfGenArgs(str, "Test String 1");
        stringIntegerGeneric.genericMethodHalfGenArgs(str, intgr, "Test String 3");

        System.out.println("--- String Double Generic ---");
        System.out.println(stringDoubleGeneric.genericMethodGenArgs(str));
        System.out.println(stringDoubleGeneric.genericMethodGenArgs(str, dbl));
        stringDoubleGeneric.genericMethodHalfGenArgs(str, "Test String 1");
        stringDoubleGeneric.genericMethodHalfGenArgs(str, dbl, "Test String 3");

        Copter copter = new Copter(1, "a123");
        Plane plane = new Plane(1, "312adas");
        Rocket rocket = new Rocket(1, "123sdqw");
        System.out.println("--- Copter Plain Generic ---");
        System.out.println(copterPlainGeneric.genericMethodGenArgs(copter));
        System.out.println(copterPlainGeneric.genericMethodGenArgs(copter, plane));
        copterPlainGeneric.genericMethodHalfGenArgs(copter, "Test String 1");
        copterPlainGeneric.genericMethodHalfGenArgs(copter, plane, "Test String 3");

        System.out.println("--- Rocket Copter Generic ---");
        System.out.println(rocketCopterGeneric.genericMethodGenArgs(rocket));
        System.out.println(rocketCopterGeneric.genericMethodGenArgs(rocket, copter));
        rocketCopterGeneric.genericMethodHalfGenArgs(rocket, "Test String 1");
        rocketCopterGeneric.genericMethodHalfGenArgs(rocket, copter, "Test String 3");
    }
}
