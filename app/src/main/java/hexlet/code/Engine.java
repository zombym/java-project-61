package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int REPEAT_COUNT = 3;

    public static void run(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        Scanner inputObj = new Scanner(System.in);
        System.out.print("May I have your name?");
        String userName = inputObj.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String rightAnswer = roundData[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer:");
            String answer = inputObj.next();
            String rightAnswerText = "Correct!";
            String wrongAnswerText = "'" + answer + "' is wrong answer ;(. Correct answer was '" + rightAnswer + "'."
                    + "\n" + "Let's try again, " + userName + "!";
            boolean result = answer.equals(roundData[1]);
            if (result) {
                System.out.println(rightAnswerText);
            } else {
                System.out.println(wrongAnswerText);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
