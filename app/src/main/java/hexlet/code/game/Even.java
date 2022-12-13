package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Even {
    static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void start() {
        Engine.run(DESCRIPTION, Even.evenDataGenerate());
    }

    public static String[][] evenDataGenerate() {
        String[][] data = new String[CommonTools.REPEAT_COUNT][2];
        for (var i = 0; i < CommonTools.REPEAT_COUNT; i++) {
            int generate = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);
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
