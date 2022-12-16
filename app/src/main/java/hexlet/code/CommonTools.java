package hexlet.code;

import java.util.Random;

public class CommonTools {

    public static int random(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max - min) + min;
        return result;
    }
}
