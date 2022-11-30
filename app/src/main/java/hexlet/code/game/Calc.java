package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Calc {


    static boolean game(String userName) {
        int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        String[] znak = {"+", "-", "*"};
        int znakPosition = Engine.random(0, znak.length - 1);

        int result = 0;
        switch (znak[znakPosition]) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            default:
                break;
        }
        System.out.println("Question: " + first + " " + znak[znakPosition] + " " + second); // + " = " + result);
        var answer = Engine.input("Your answer:");
        if (Integer.parseInt(answer) == result) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void calcGame() {
        var userName = Greet.greetings();
        System.out.println("What is the result of the expression?");

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = game(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName  + "!");
    }
}
