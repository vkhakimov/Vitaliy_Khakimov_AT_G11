package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class StringTask {
    public void charsInColumn(String str) {
        char current;
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            System.out.println(current);
        }
    }

    public void wordsDuplicates(String str) {
        String[] words = str.split("\\s+");
        Arrays.sort(words);
        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                System.out.println(words[i]);
            }
        }
    }

    public void findNumbers(String str) {
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

    public void parseAccessLog(String logText) {
        Map<String, int[]> accessResults = new HashMap<>();
        String[] lines = logText.split("\n");
        for (String line : lines) {
            String[] parts = line.split("\\s+");

            if (parts.length >= 3) {
                String ip = parts[1];
                String status = parts[2];

                accessResults.putIfAbsent(ip, new int[]{0, 0});

                if (status.equals("granted")) {
                    accessResults.get(ip)[0]++;
                } else if (status.equals("denied")) {
                    accessResults.get(ip)[1]++; // Increment "failed" counter
                }
            }
        }

        for (Map.Entry<String, int[]> entry : accessResults.entrySet()) {
            String ip = entry.getKey();
            int[] counts = entry.getValue();
            System.out.println("ip " + ip + ": ok - " + counts[0] + ", failed - " + counts[1] + ";");
        }
    }

    public void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        String formattedDate = now.format(dateFormatter);

        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Datetime now is: " + formattedDate + ", " + hour + " hour(s) " + minute + " minute(s).");
    }

    public void formatDateTime(String str) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);

        LocalDateTime dateTime = LocalDateTime.parse(str, inputFormatter);

        String formattedDateTime = dateTime.format(outputFormatter);

        System.out.println(formattedDateTime);
    }
}
