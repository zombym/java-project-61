package hexlet.code.game;

import hexlet.code.Engine;

public class Prime {

    static public String[][] primeDataGenerate () {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {

            int number = Engine.random(1, Engine.MAX_RANDOM_RANGE);
            var msg ="Question: " + number;

            var result = isPrime(number);

            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }


    static String isPrime(int num) {
        if (num <= 1) {
            return "no";
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

//    static boolean primeGameLogic(String userName) {
//        int number = Engine.random(1, Engine.MAX_RANDOM_RANGE);
//        Engine.questionGenerate("Question: " + number);
//        var answer = Engine.input("Your answer:");
//
//        var result = isPrime(number);
//
//        return Engine.answerOutput(answer, result, userName);
//    }
//
//    public static void game(String taskMsg, String userName) {
//        System.out.println(taskMsg);
//
//        var count = 0;
//        while (count < Engine.REPEAT_COUNT) {
//            var result = primeGameLogic(userName);
//            if (result) {
//                count++;
//            } else {
//                return;
//            }
//        }
//        Engine.congratulationGenerate(userName);
//    }
}
