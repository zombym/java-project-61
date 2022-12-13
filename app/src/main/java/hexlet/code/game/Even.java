package hexlet.code.game;

import hexlet.code.ComonTools;

public class Even {
    public static String[][] evenDataGenerate() {
        String[][] data = new String[ComonTools.REPEAT_COUNT][2];
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {
            int generate = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);
            String result = Even.isEven(generate);
            var msg = "Question: " + Integer.toString(generate);
            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }

    static String isEven(int input) {
        return (input % 2 == 0) ? "yes" : "no";
    }
}
