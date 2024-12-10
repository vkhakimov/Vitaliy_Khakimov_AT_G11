package homework.day9;

import java.util.stream.Stream;

public class FiguresRunner {
    public static void main(String[] args) {
        Stream<String> figures = Stream.of("Овал", "Прямоугольник", "Круг", "Квадрат", "Эллипс");

        figures.map(f -> f.length()).filter(f -> f > 4)
                .forEach(System.out::println);
    }
}
