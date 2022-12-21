package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int REPEAT_COUNT = 3;

    static String userInput(String question) {
        System.out.print(question + " ");
        Scanner inputObj = new Scanner(System.in);
        String answer = inputObj.nextLine();
        return answer;
    }

    public static void run(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        String userName = userInput("May I have your name?");
        System.out.println("Hello, " + userName + "!");
        System.out.println(description);
        for (String[] roundData : roundsData) {
            String question = roundData[0];
            String rightAnswer = roundData[1];

            System.out.println("Question: " + question);
            String answer = userInput("Your answer:");

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
