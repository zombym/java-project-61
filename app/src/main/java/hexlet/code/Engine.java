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
            System.out.println("Question: " + roundData[0]);
            String answer = userInput("Your answer:");

            String rightAnswer = "Correct!";
            String wrongAnswer = "'" + answer + "' is wrong answer ;(. Correct answer was '" + roundData[1] + "'."
                    + "\n" + "Let's try again, " + userName + "!";

            boolean result = answer.equals(roundData[1]);

            if (result) {
                System.out.println(rightAnswer);
            } else {
                System.out.println(wrongAnswer);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
