package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {

    static public String[][] calcDataGenerate () {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {

            int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
            int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);
            String[] znak = {"+", "-", "*"};
            int znakPosition = Engine.random(0, znak.length - 1);

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

//
//    static public String[] calcDataGenerate () {
//        int generate = Engine.random(1, Engine.MAX_RANDOM_RANGE);
//        String result = Engine.isEven(generate);
//        String[] data = {Integer.toString(generate), result};
//        return data;
//    }



//    static boolean calcGameLogic(String userName) {
//        int first = Engine.random(1, Engine.MAX_RANDOM_RANGE);
//        int second = Engine.random(1, Engine.MAX_RANDOM_RANGE);
//        String[] znak = {"+", "-", "*"};
//        int znakPosition = Engine.random(0, znak.length - 1);
//
//        String result = "";
//        switch (znak[znakPosition]) {
//            case "+":
//                result = String.valueOf(first + second);
//                break;
//            case "-":
//                result = String.valueOf(first - second);
//                break;
//            case "*":
//                result = String.valueOf(first * second);
//                break;
//            default:
//                break;
//        }
//        Engine.questionGenerate("Question: " + first + " " + znak[znakPosition] + " " + second);
//        var answer = Engine.input("Your answer:");
//
//        return Engine.answerOutput(answer, result, userName);
//    }
//
//    public static void game(String taskMsg, String userName) {
//        System.out.println(taskMsg);
//
//        var count = 0;
//        while (count < Engine.REPEAT_COUNT) {
//            var result = calcGameLogic(userName);
//            if (result) {
//                count++;
//            } else {
//                return;
//            }
//        }
//        Engine.congratulationGenerate(userName);
//    }
}
