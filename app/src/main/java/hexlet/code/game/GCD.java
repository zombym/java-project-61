package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class GCD {

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static boolean game(String userName) {
        int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);

        System.out.println("Question: " + first + " " + second);
        var answer = Engine.input("Your answer:");
        var result = gcd(first, second);

        if (Integer.parseInt(answer) == result) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void gcdGame() {
        var userName = Greet.greetings();
        System.out.println("Find the greatest common divisor of given numbers.");

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
