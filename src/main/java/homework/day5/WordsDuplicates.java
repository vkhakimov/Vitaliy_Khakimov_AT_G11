package homework.day5;

import java.util.Arrays;

public class WordsDuplicates {
    public static void wordsDuplicates(String str) {
        String[] words = str.split("\\s+");
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                System.out.println(words[i]);
            }
        }
    }
}
