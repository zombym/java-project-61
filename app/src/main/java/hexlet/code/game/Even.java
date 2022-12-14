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

            String result = isEven(generatedNumber) ? "yes" : "no";
            String question = Integer.toString(generatedNumber);

            data[i][0] = question;
            data[i][1] = result;
        }
        return data;
    }

    static boolean isEven(int input) {
        return (input % 2 == 0);
    }
}
