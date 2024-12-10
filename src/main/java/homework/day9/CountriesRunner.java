package homework.day9;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(c -> c.matches(".*[АОУЭЫИЯЕЁЮаоуэыияеёю].*"))
                .filter(c -> c.length() < 7)
                .map(c -> "\"" + c.toUpperCase() + "\"")
                .forEach(System.out::println);
    }
}
