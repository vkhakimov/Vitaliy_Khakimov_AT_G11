package homework.day7;

import homework.day7.task01.City;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task20 {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        Map<String, City> cityMap = new HashMap<>();
        int sumPopulation = 0;

        cities.add(new City("Москва", 12000000));
        cities.add(new City("Нью-Йорк", 8400000));
        cities.add(new City("Париж", 2200000));

        System.out.println("===============================================");
        System.out.print("Cities names: ");
        for (City city : cities) {
            System.out.print(city.getName() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Cities population: ");
        for (City city : cities) {
            System.out.print(city.getPopulation() + " ");
        }

        for (int i = 0; i < cities.size(); i++) {
            cityMap.put(cities.get(i).getName(), cities.get(i));
        }

        for (City city : cityMap.values()) {
            sumPopulation += city.getPopulation();
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Sum population: " + sumPopulation);
    }
}
