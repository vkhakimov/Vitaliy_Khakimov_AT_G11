package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3342, 34, 79, 23426, 68, 1324, 55, 7699));
        int sum = 0;

        System.out.println("===============================================");
        System.out.print("List of numbers:");
        for (int number : numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.println("===============================================");
        System.out.print("Sum of numbers: " + sum);

        numbers.sort(Integer::compareTo);

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Sorted by ASC list of numbers: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Sorted by DESC list of numbers: ");
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
