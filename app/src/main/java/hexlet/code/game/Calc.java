package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {

    static boolean calcGameLogic(String userName, String answer) {
        int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        String[] znak = {"+", "-", "*"};
        int znakPosition = Engine.random(0, znak.length - 1);

        String result = "";
        switch (znak[znakPosition]) {
            case "+":
                result = String.valueOf(first + second);
                break;
            case "-":
                result = String.valueOf(first - second);
                break;
            case "*":
                result = String.valueOf(first * second);
                break;
            default:
                break;
        }

        System.out.println("Question: " + first + " " + znak[znakPosition] + " " + second);

        return Engine.answerOutput(answer, result, userName);
    }

    public static void game(String taskMsg, String userName, String answer) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = calcGameLogic(userName, answer);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName  + "!");
    }
}
