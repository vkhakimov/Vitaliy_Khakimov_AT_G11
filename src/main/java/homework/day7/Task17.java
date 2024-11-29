package homework.day7;

import homework.day7.task01.Fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task17 {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        Map<Integer, Fruit> fruitMap = new HashMap<>();

        fruits.add(new Fruit("Яблоко", 120));
        fruits.add(new Fruit("Банан", 80));
        fruits.add(new Fruit("Груша", 150));
        fruits.add(new Fruit("Апельсин", 200));

        System.out.println("===============================================");
        System.out.print("Fruits names: ");
        for (Fruit fruit : fruits) {
            System.out.print(fruit.getName() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Fruits weights: ");
        for (Fruit fruit : fruits) {
            System.out.print(fruit.getWeight() + " ");
        }

        for (int i = 0; i < fruits.size(); i++) {
            fruitMap.put(i, fruits.get(i));
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("fruitMap keys:");
        for (int i : fruitMap.keySet()) {
            System.out.println(i);
        }

        System.out.println("===============================================");
        System.out.println("fruitMap values:");
        for (Fruit fruit : fruitMap.values()) {
            System.out.println(fruit);
        }

        System.out.println("===============================================");
        System.out.println("Iterate through the key and value:");
        for (Map.Entry<Integer, Fruit> fruitEntry : fruitMap.entrySet()) {
            System.out.println(fruitEntry);
        }
    }
}
