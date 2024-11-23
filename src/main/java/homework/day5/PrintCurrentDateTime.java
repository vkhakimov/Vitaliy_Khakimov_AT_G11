package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrintCurrentDateTime {
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("d MMMM, yyyy");
        String formattedDate = now.format(dateFormatter);

        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Datetime now is: " + formattedDate + ", " + hour + " hour(s) " + minute + " minute(s).");
    }
}
