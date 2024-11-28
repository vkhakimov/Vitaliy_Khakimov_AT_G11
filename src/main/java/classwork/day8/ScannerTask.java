package classwork.day8;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String incoming = scanner.nextLine();
            if (incoming.contains("world")) {
                System.out.println("Stop-word detected");
                return;
            }
            System.out.println("Just got '" + incoming + "' text !");
        }
    }
}
