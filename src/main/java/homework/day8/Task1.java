package homework.day8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1 output = new Task1();
        output.outputFromKeyboard();
    }

    public void outputFromKeyboard() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your string:");
        String incoming = input.nextLine();
        System.out.println("Hello, I just got '" + incoming + "' from you!");
    }
}
