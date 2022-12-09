package hexlet.code.game;

import hexlet.code.Engine;

public class Even {

    static public String[][] evenDataGenerate () {
        String[][] data = new String[Engine.REPEAT_COUNT][2];
        for (var i = 0; i < Engine.REPEAT_COUNT; i++) {
            int generate = Engine.random(1, Engine.MAX_RANDOM_RANGE);
            String result = Engine.isEven(generate);
            var msg = "Question: " + Integer.toString(generate);
            data[i][0] = msg;
            data[i][1] = result;
        }
        return data;
    }

}
