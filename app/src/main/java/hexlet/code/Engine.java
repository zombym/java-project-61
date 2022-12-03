package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static final int MAX_RANDOM_RANGE = 100;
    public static final int REPEAT_COUNT = 3;
    public static String input(String question) {
        System.out.print(question + " ");
        Scanner inputObj = new Scanner(System.in);
        String answer = inputObj.nextLine();
        return answer;
    }
    public static int random(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max - min) + min;
        return result;
    }
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        var userName = Engine.input("May I have your name?");
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
