package homework.day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        List<Double> doubles = new ArrayList<>(Arrays.asList(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9));
        double multiplication = 1.0;
        double decimalSum = 0;

        System.out.println("===============================================");
        System.out.print("List of doubles: ");
        for (double dbl : doubles) {
            System.out.print(dbl + " ");
            multiplication *= dbl;
            double decimalPart = dbl % 1;
            decimalSum += decimalPart;
        }

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Multiplication of doubles: " + Math.round(multiplication * 100) / 100);

        System.out.println();
        System.out.println("===============================================");
        System.out.print("Sum of decimals: " + decimalSum);

        System.out.println();
        System.out.println("===============================================");
        System.out.println("List of int parts:");
        for (int i = 0; i < doubles.size(); i++) {
            int intPart = (int) (double) doubles.get(i);
            System.out.print(intPart + " ");
        }

    }
}
