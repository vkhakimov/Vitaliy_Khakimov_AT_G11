package homework.day5;

public class FindNumbers {
    public static void findNumbers(String str) {
        int[] numbers = new int[str.length()];
        int count = 0;
        StringBuilder numberBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                numberBuilder.append(c);
            } else if (!numberBuilder.isEmpty()) {
                numbers[count++] = Integer.parseInt(numberBuilder.toString());
                numberBuilder.setLength(0);
            }
        }

        if (!numberBuilder.isEmpty()) {
            numbers[count++] = Integer.parseInt(numberBuilder.toString());
        }

        int[] numbersArray = new int[count];
        System.arraycopy(numbers, 0, numbersArray, 0, count);
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }
}
