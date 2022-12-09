package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_STEP = 5;
    static final int MIN_ROW = 5;
    static final int MAX_ROW = 11;
    static final int MAX_FIRST = 50;

    static public String[][] progressionDataGenerate () {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {

            int step = Engine.random(1, MAX_STEP);
            int len = Engine.random(MIN_ROW, MAX_ROW);
            int first = Engine.random(1, MAX_FIRST);
            int unknown = Engine.random(0, len - 1);
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

//    static boolean progressionGameLogic(String userName) {
//        int step = Engine.random(1, MAX_STEP);
//        int len = Engine.random(MIN_ROW, MAX_ROW);
//        int first = Engine.random(1, MAX_FIRST);
//        int unknown = Engine.random(0, len - 1);
//        int[] numbers = new int[len];
//        numbers[0] = first;
//        for (var i = 1; i < numbers.length; i++) {
//            numbers[i] = numbers[i - 1] + step;
//        }
//        var result = "";
//
//        String msg = "Question: ";
//        for (var i = 0; i < numbers.length; i++) {
//            if (numbers[i] == numbers[unknown]) {
//                msg += ".. ";
//                result = String.valueOf(numbers[i]);
//            } else {
//                msg += numbers[i] + " ";
//            }
//
//        }
//        Engine.questionGenerate(msg);
//
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
//            var result = progressionGameLogic(userName);
//            if (result) {
//                count++;
//            } else {
//                return;
//            }
//        }
//        Engine.congratulationGenerate(userName);
//    }
}

