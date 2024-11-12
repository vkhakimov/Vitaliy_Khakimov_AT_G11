package homework.cycletask;

import java.util.Random;

public class ArrayTask {
    public void arrayTest() {
        int[] arr = new int[7];
        Random random = new Random();

        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Multiplied array: ");
        for (int i : arr) {
            System.out.print(i * 5 + " ");
        }

        System.out.println();
        System.out.println("Squared array: ");
        for (int i : arr) {
            System.out.print(i * i + " ");
        }

        System.out.println();
        System.out.println("Min value: ");
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print(min);

        System.out.println();
        System.out.println("Updated array: ");
        int first = arr[0];
        arr[0] = arr[6];
        arr[6] = first;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Sorted array");
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
