package hexlet.code.game;

import hexlet.code.Engine;

public class GCD {

    static String gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return String.valueOf(a);
    }

    static boolean gcdGameLogic(String userName) {
        int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);

        System.out.println("Question: " + first + " " + second);
        var answer = Engine.input("Your answer:");
        var result = gcd(first, second);

        return Engine.answerOutput(answer, result, userName);
    }

    public static void game(String taskMsg, String userName) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = gcdGameLogic(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
