package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    static final int MAX_RANDOM_RANGE = 100;

    public static void start() {
        Engine.run(DESCRIPTION, gcdDataGenerate());
    }

    static String[][] gcdDataGenerate() {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {
            int first = CommonTools.random(1, MAX_RANDOM_RANGE);
            int second = CommonTools.random(1, MAX_RANDOM_RANGE);

            String result = String.valueOf(gcd(first, second));
            String question = first + " " + second;

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
