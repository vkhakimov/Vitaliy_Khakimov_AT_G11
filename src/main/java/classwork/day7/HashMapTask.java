package classwork.day7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
        String str = "мама мыла раму мыла";
        String[] splitStr = str.split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < splitStr.length; i++) {
            words.put(i, splitStr[i]);
        }

        System.out.println("Iterate through the keys:");
        for (int word : words.keySet()) {
            System.out.println(word);
        }

        System.out.println("Iterate through the values:");
        for (String word : words.values()) {
            System.out.println(word);
        }

        System.out.println("Iterate through the combination:");
        for (Map.Entry<Integer, String> word : words.entrySet()) {
            System.out.println(word);
        }
    }
}
