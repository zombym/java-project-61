package hexlet.code.game;

import hexlet.code.ComonTools;

public class Calc {
    public static String[][] calcDataGenerate() {
        String[][] data = new String[ComonTools.REPEAT_COUNT][2];
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {

            int first = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);
            int second = ComonTools.random(1, ComonTools.MAX_RANDOM_RANGE);
            String[] znak = {"+", "-", "*"};
            int znakPosition = ComonTools.random(0, znak.length - 1);

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
