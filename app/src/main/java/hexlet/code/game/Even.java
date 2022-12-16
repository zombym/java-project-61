package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Even {
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    static final int MAX_RANDOM_RANGE = 100;

    public static void start() {
        Engine.run(DESCRIPTION, evenDataGenerate());
    }

    static String[][] evenDataGenerate() {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {
            int generatedNumber = CommonTools.random(1, MAX_RANDOM_RANGE);
            String result = Even.isEven(generatedNumber);
            var msg = "Question: " + Integer.toString(generatedNumber);
            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }

    static String isEven(int input) {
        return (input % 2 == 0) ? "yes" : "no";
    }
}
