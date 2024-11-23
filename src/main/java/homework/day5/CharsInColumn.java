package homework.day5;

public class CharsInColumn {
    public static void charsInColumn(String str) {
        char current;
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            System.out.println(current);
        }
    }
}
