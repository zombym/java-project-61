package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Prime {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void start() {
        Engine.run(DESCRIPTION, Prime.primeDataGenerate());
    }

    public static String[][] primeDataGenerate() {
        String[][] data = new String[CommonTools.REPEAT_COUNT][2];
        for (var i = 0; i < CommonTools.REPEAT_COUNT; i++) {

            int number = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);
            var msg = "Question: " + number;

            var result = isPrime(number);

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }

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
}
