package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class CommonTools {
    public static final int MAX_RANDOM_RANGE = 100;
    public static final int REPEAT_COUNT = 3;

    static String input(String question) {
        System.out.print(question + " ");
        Scanner inputObj = new Scanner(System.in);
        String answer = inputObj.nextLine();
        return answer;
    }

    static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        var userName = CommonTools.input("May I have your name?");
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    static boolean printAnswer(String answer, String result, String userName) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    static void printCongratulation(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    static void printTask(String task) {
        System.out.println(task);
    }

    static void printQuestion(String question) {
        System.out.println(question);
    }

    public static int random(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max - min) + min;
        return result;
    }
}
