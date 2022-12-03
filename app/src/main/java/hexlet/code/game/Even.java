package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    static boolean evenGameLogic(String userName) {
        int generate = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + generate);
        var answer = Engine.input("Your answer:");

        String result = (generate % 2 == 0) ? "yes" : "no";

        return Engine.answerOutput(answer, result, userName);
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
