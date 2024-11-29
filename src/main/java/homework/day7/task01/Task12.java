package homework.day7.task01;

import java.util.ArrayList;
import java.util.List;

public class Task12 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        System.out.println("===============================================");
        System.out.print("Ages: ");
        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Names: ");
        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.println("Persons toString():");
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
