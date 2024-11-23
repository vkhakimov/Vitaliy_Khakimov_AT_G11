package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatDateTime {
    public static void formatDateTime(String str) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm dd.MM.yyyy");

        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, d, yyyy HH:mm", Locale.ENGLISH);

        LocalDateTime dateTime = LocalDateTime.parse(str, inputFormatter);

        String formattedDateTime = dateTime.format(outputFormatter);

        System.out.println(formattedDateTime);
    }
}
