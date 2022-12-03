package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    static boolean evenGameLogic(String userName) {
        int generate = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + generate);
        var answer = Engine.input("Your answer:");

        String result = (generate % 2 == 0) ? "yes" : "no";

        if (answer.equals(result)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void game(String taskMsg, String userName) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = evenGameLogic(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
