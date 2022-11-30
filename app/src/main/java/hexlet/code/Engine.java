package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    public static String input(String question) {
        System.out.print(question + " ");
        Scanner inputObj = new Scanner(System.in);
        String answer = inputObj.nextLine();
        return answer;
    }
    public static int random(int min, int max) {
        Random r = new Random();
        int result = r.nextInt(max-min) + min;
        return result;
    }
}
