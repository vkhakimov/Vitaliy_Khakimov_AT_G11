package homework.day7;

import homework.day7.task01.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task18 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Map<String, Car> carMap = new HashMap<>();

        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Ford", "Mustang"));
        cars.add(new Car("BMW", "X5"));

        System.out.println("===============================================");
        System.out.println("Brand : Model:");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " : " + car.getModel());
        }

        for (int i = 0; i < cars.size(); i++) {
            carMap.put(cars.get(i).getBrand(), cars.get(i));
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("carMap keys:");
        for (String brand : carMap.keySet()) {
            System.out.println(brand);
        }

        System.out.println("===============================================");
        System.out.println("carMap values:");
        for (Car car : carMap.values()) {
            System.out.println(car);
        }

        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<String, Car> carEntry : carMap.entrySet()) {
            System.out.println(carEntry);
        }
    }
}
