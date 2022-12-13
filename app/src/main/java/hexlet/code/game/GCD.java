package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class GCD {
    static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void start() {
        Engine.run(DESCRIPTION, gcdDataGenerate());
    }

    static String[][] gcdDataGenerate() {
        String[][] data = new String[CommonTools.REPEAT_COUNT][2];
        for (var i = 0; i < CommonTools.REPEAT_COUNT; i++) {

            int first = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);
            int second = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);

            var msg = "Question: " + first + " " + second;
            var result = gcd(first, second);

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }

    static String gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return String.valueOf(a);
    }
}
