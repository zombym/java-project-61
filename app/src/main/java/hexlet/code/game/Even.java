package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Even {
    static boolean game(String userName) {
        int result = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + result);
        var choose = Engine.input("Your answer:");

        String answer = (result % 2 == 0) ? "yes" : "no";
        if (answer.equals(choose)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + choose + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void evenGame() {
        var userName = Greet.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var count = 0;
        while (count < Engine.REPEAT_COUNT) {
            var result = game(userName);
            if (result) {
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
