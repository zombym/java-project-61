package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Prime {
    static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    static final int MAX_RANDOM_RANGE = 100;

    public static void start() {
        Engine.run(DESCRIPTION, primeDataGenerate());
    }

    static String[][] primeDataGenerate() {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {
            int generatedNumber = CommonTools.random(1, MAX_RANDOM_RANGE);

            String result = isPrime(generatedNumber) ? "yes" : "no";
            String question = Integer.toString(generatedNumber);

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
