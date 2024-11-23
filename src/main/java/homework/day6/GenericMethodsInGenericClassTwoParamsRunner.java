package homework.day6;

import homework.playground.essence.Matter;
import homework.playground.essence.craft.air.AirTransport;
import homework.playground.essence.craft.air.Copter;
import homework.playground.essence.craft.air.Plain;
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

        GenericMethodsInGenericClassT<AirTransport> airTransportGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Copter> copterGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plain> plainGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rocket> rocketGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Car> carGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Moped> mopedGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Motorbike> motorbikeGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vehicle> vehicleGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Bottle> bottleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Can> canGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Container> containerGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mug> mugGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Animal> animalGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Beetle> beetleGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Carrot> carrotGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Chamomile> chamomileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Crocodile> crocodileGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Flower> flowerGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Fly> flyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Insect> insectGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Maylily> maylilyGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Mosquito> mosquitoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Pigeon> pigeonGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Plant> plantGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Potato> potatoGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Radish> radishGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Raven> ravenGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Rose> roseGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vegetable> vegetableGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Vertebrata> vertebrataGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Diesel> dieselGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Petrol> petrolGeneric = new GenericMethodsInGenericClassT<>();
        GenericMethodsInGenericClassT<Water> waterGeneric = new GenericMethodsInGenericClassT<>();

        GenericMethodsInGenericClassT<Matter> matterGeneric = new GenericMethodsInGenericClassT<>();
    }
}
