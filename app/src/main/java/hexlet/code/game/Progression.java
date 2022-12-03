package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_STEP = 5;
    static final int MIN_ROW = 5;
    static final int MAX_ROW = 11;
    static final int MAX_FIRST = 50;

    static boolean progressionGameLogic(String userName) {
        int step = Engine.random(1, MAX_STEP);
        int len = Engine.random(MIN_ROW, MAX_ROW);
        int first = Engine.random(1, MAX_FIRST);
        int unknown = Engine.random(0, len - 1);
        int[] numbers = new int[len];
        numbers[0] = first;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + step;
        }
        var result = "";
        System.out.print("Question: ");
        for (var i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[unknown]) {
                System.out.print(".. ");
                result = String.valueOf(numbers[i]);
            } else {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        var answer = Engine.input("Your answer:");

        if (result.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void game(String taskMsg, String userName) {
        System.out.println(taskMsg);

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = progressionGameLogic(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}

