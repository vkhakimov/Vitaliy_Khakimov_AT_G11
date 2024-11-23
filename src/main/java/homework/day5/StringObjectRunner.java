package homework.day5;

public class StringObjectRunner {
    public static void main(String[] args) {
        StringTask stringTask = new StringTask();
        System.out.println("List of characters in column:");
        stringTask.charsInColumn("Hello World!");
        System.out.println("Duplicates in string:");
        stringTask.wordsDuplicates("Hello World Test World Hello");
        System.out.println("Extracting numbers from string:");
        stringTask.findNumbers("qwerty1asd2xzc3");
        System.out.println("Log parsing:");
        String logText = """
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                """;
        stringTask.parseAccessLog(logText);
        System.out.println("Current date and time");
        stringTask.printCurrentDateTime();
        System.out.println("Formatted date and time");
        stringTask.formatDateTime("22.00 07.09.2020");
    }
}
