package hexlet.code.game;

import hexlet.code.ComonTools;

public class Prime {
    public static String[][] primeDataGenerate() {
        String[][] data = new String[ComonTools.REPEAT_COUNT][2];
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {

            int number = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);
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
