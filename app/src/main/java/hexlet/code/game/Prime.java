package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;

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

    static boolean game(String userName) {
        int number = Engine.random(1, Engine.MAX_RANDOM_RANGE);
        System.out.println("Question: " + number);
        var answer = Engine.input("Your answer:");

        var result = isPrime(number);

        if (result.equals(answer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void primeGame() {
        var userName = Greet.greetings();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

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
