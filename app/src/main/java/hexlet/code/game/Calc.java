package hexlet.code.game;

import hexlet.code.CommonTools;
import hexlet.code.Engine;

public class Calc {
    static final String DESCRIPTION = "What is the result of the expression?";
    static final int MAX_RANDOM_RANGE = 100;
    static final String[] OPERATORS = {"+", "-", "*"};

    public static void start() {
        Engine.run(DESCRIPTION, calcDataGenerate());
    }

    static String calculate(int first, int second, String operator) {
        switch (operator) {
            case "+":
                return String.valueOf(first + second);
            case "-":
                return String.valueOf(first - second);
            case "*":
                return String.valueOf(first * second);
            default:
                return "";
        }
    }

    static String[][] calcDataGenerate() {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {

            int first = CommonTools.random(1, MAX_RANDOM_RANGE);
            int second = CommonTools.random(1, MAX_RANDOM_RANGE);
            int operatorPosition = CommonTools.random(0, OPERATORS.length - 1);

            String result = calculate(first, second, OPERATORS[operatorPosition]);

            var msg = "Question: " + first + " " + OPERATORS[operatorPosition] + " " + second;

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }
}
