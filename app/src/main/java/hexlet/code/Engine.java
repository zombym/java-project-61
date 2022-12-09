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
    public static boolean answerOutput(String answer, String result, String userName) {
        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }
//    public static void questionGenerate(String msg) {
//        System.out.println(msg);
//    }
    public static void congratulationGenerate(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
    public static String isEven(int input) {
        return (input % 2 == 0) ? "yes" : "no";
    }

    public static void run(String task, String[][] roundsData) {
        var userName = Engine.greetings();
        var count = 0;
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {
            System.out.println(task);
            System.out.println(roundsData[i][0]);
            var answer = Engine.input("Your answer:");
            var result = Engine.answerOutput(answer, roundsData[i][1], userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        Engine.congratulationGenerate(userName);
    }
}
