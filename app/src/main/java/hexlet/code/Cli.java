package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greetings() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inputObj = new Scanner(System.in);
        String userName = inputObj.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
