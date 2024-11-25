package classwork.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTask {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        String str = "мама мыла раму мыла";
        String[] splitStr = str.split(" ");

        myList.addAll(Arrays.asList(splitStr));

        System.out.println("Iterated list by for loop:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i) + " ");
        }

        System.out.println("Iterated list by for-each loop:");
        for (String word : myList) {
            System.out.println(word);
        }
    }
}
