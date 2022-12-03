package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    static boolean evenGameLogic(String userName, String answer) {
        int generate = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + generate);

        String result = (generate % 2 == 0) ? "yes" : "no";

        return Engine.answerOutput(answer, result, userName);
    }

    public static void game(String taskMsg, String userName, String answer) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = evenGameLogic(userName, answer);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
