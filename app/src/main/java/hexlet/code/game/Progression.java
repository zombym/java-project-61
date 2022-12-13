package hexlet.code.game;

import hexlet.code.ComonTools;

public class Progression {
    static final int MAX_STEP = 5;
    static final int MIN_ROW = 5;
    static final int MAX_ROW = 11;
    static final int MAX_FIRST = 50;

    public static String[][] progressionDataGenerate() {
        String[][] data = new String[ComonTools.REPEAT_COUNT][2];
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {

            int step = ComonTools.random(1, MAX_STEP);
            int len = ComonTools.random(MIN_ROW, MAX_ROW);
            int first = ComonTools.random(1, MAX_FIRST);
            int unknown = ComonTools.random(0, len - 1);
            int[] numbers = new int[len];
            numbers[0] = first;
            for (var j = 1; j < numbers.length; j++) {
                numbers[j] = numbers[j - 1] + step;
            }
            var result = "";

            String msg = "Question: ";
            for (var j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[unknown]) {
                    msg += ".. ";
                    result = String.valueOf(numbers[j]);
                } else {
                    msg += numbers[j] + " ";
                }

            }

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }
}

