package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Progression {
    static final String DESCRIPTION = "What number is missing in the progression?";

    static final int MAX_STEP = 5;
    static final int MIN_ROW = 5;
    static final int MAX_ROW = 11;
    static final int MAX_FIRST = 50;

    public static void start() {
        Engine.run(DESCRIPTION, progressionDataGenerate());
    }

    static String[] progressionGenerator(int first, int len, int step) {
        String[] numbers = new String[len];
        numbers[0] = Integer.toString(first);
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = Integer.toString(Integer.parseInt(numbers[j - 1]) + step);
        }
        return numbers;
    }

    static String[][] progressionDataGenerate() {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {

            int step = CommonTools.random(1, MAX_STEP);
            int len = CommonTools.random(MIN_ROW, MAX_ROW);
            int first = CommonTools.random(1, MAX_FIRST);
            int unknown = CommonTools.random(0, len - 1);

            var progression = progressionGenerator(first, len, step);

            var result = progression[unknown];
            progression[unknown] = "..";

            String msg = "Question: ";
            for (var j = 0; j < progression.length; j++) {
                msg += progression[j] + " ";
            }

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }
}

