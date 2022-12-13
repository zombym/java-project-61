package hexlet.code.game;

import hexlet.code.ComonTools;

public class GCD {
    public static String[][] gcdDataGenerate() {
        String[][] data = new String[ComonTools.REPEAT_COUNT][2];
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {

            int first = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);
            int second = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);

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
