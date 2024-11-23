package homework.day5;

public class StringStaticRunner {
    public static void main(String[] args) {
        System.out.println("List of characters in column:");
        CharsInColumn.charsInColumn("Hello World!");
        System.out.println("Duplicates in string:");
        WordsDuplicates.wordsDuplicates("Hello World Test World Hello");
        System.out.println("Extracting numbers from string:");
        FindNumbers.findNumbers("qwerty1asd2xzc3");
        System.out.println("Log parsing:");
        String logText = """
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """;
        ParseLog.parseAccessLog(logText);
        System.out.println("Current date and time");
        PrintCurrentDateTime.printCurrentDateTime();
        System.out.println("Formatted date and time");
        FormatDateTime.formatDateTime("22.00 07.09.2020");
    }
}
