package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {

    static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

    static boolean primeGameLogic(String userName) {
        int number = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + number);
        var answer = Engine.input("Your answer:");

        var result = isPrime(number);

        return Engine.answerOutput(answer, result, userName);
    }

    public static void game(String taskMsg, String userName) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = primeGameLogic(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
