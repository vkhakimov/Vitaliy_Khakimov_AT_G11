package homework.day9;

import homework.day7.task01.Person;

import java.io.FileWriter;
import java.util.Comparator;
import java.util.stream.Stream;

public class PersonsRunner {
    public static void main(String[] args) {
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша"));

        try (FileWriter fileWriter = new FileWriter("people_runner_out.txt")) {
            fileWriter.write(String.valueOf("Average age: " +
                    people.filter(person -> person.getAge() < 60)
                            .sorted(Comparator.comparing(person -> person.getName()))
                            .map(person -> new Person(person.getAge() + 4, person.getName().toUpperCase()))
                            .mapToInt(Person::getAge)
                            .average()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
