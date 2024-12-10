package homework.day9;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumbs");

        Stream<String> newElements = elements.map(el -> {
            String[] words = el.split("[ \\-]");
            return IntStream.range(0, words.length)
                    .mapToObj(index -> {
                        String word = words[index];
                        if ((index + 1) % 2 == 1) {
                            return word.replace('e', 'o');
                        } else {
                            return String.valueOf(word.length());
                        }
                    })
                    .collect(Collectors.joining(" "));
        });

        newElements.forEach(System.out::println);
    }
}
