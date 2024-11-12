package homework.arraytask;

public class ArrayTask {
    public static void sumOfNElements(int[] arr, int n) {
        int sum = 0;
        int counter = 0;
        for (int num : arr) {
            counter++;
            if (counter == n) {
                sum += num;
                counter = 0;
            }
        }
        System.out.println("Sum of each " + n + " element:");
        System.out.println(sum);
    }

    public static void elementsGreaterThanN(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                count++;
            }
        }

        int j = 0;
        int[] newArr = new int[count];
        for (int i : arr) {
            if (i > n) {
                newArr[j] = i;
                j++;
            }
        }

        System.out.println("New reversed array: ");
        for (int i = newArr.length - 1; i >= 0; i--) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sumOfNElements(arr, 2);
        elementsGreaterThanN(arr, 2);
    }
}
