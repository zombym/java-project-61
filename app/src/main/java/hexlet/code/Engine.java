package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int REPEAT_COUNT = 3;

    static String input(String question) {
        System.out.print(question + " ");
        Scanner inputObj = new Scanner(System.in);
        String answer = inputObj.nextLine();
        return answer;
    }

//    static void printCongratulation(String userName) {
//        System.out.println("Congratulations, " + userName + "!");
//    }
//
//    static void printTask(String task) {
//        System.out.println(task);
//    }
//
//    static void printQuestion(String question) {
//        System.out.println(question);
//    }

    static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        var userName = input("May I have your name?");
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

    public static void run(String description, String[][] roundsData) {
        var userName = greetings();
        System.out.println(description);
        for (String[] roundData : roundsData) {

            System.out.println("Question: " + roundData[0]);
            var answer = input("Your answer:");
            var result = printAnswer(answer, roundData[1], userName);
            if (!result) {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
