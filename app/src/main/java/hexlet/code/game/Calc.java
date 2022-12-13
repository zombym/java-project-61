package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Calc {
    static final String DESCRIPTION = "What is the result of the expression?";

    public static void start() {
        Engine.run(DESCRIPTION, Even.evenDataGenerate());
    }

    public static String[][] calcDataGenerate() {
        String[][] data = new String[CommonTools.REPEAT_COUNT][2];
        for (var i = 0; i < CommonTools.REPEAT_COUNT; i++) {

            int first = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);
            int second = CommonTools.random(1, CommonTools.MAX_RANDOM_RANGE);
            String[] znak = {"+", "-", "*"};
            int znakPosition = CommonTools.random(0, znak.length - 1);

            String result = "";
            switch (znak[znakPosition]) {
                case "+":
                    result = String.valueOf(first + second);
                    break;
                case "-":
                    result = String.valueOf(first - second);
                    break;
                case "*":
                    result = String.valueOf(first * second);
                    break;
                default:
                    break;
            }
            var msg = "Question: " + first + " " + znak[znakPosition] + " " + second;

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }
}
