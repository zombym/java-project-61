package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;
import java.util.Arrays;

public class Progression {

    static boolean game(String userName) {
        int step = Engine.random(1, 5);
        int len = Engine.random(5, 11);
        int first = Engine.random(1, 50);
        int unknown = Engine.random(0, len - 1);
        int[] numbers = new int[len];
        numbers[0] = first;
        for (var i = 1; i < numbers.length; i++) {
            numbers[i] = numbers[i-1] + step;
        }
        var result = 0;
        System.out.print("Question: ");
        for (var i = 0; i < numbers.length; i++) {
            if(numbers[i] == numbers[unknown]){
                System.out.print(".. ");
                result = numbers[i];
            } else {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        var answer = Engine.input("Your answer:");
        if (Integer.parseInt(answer) == result) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return false;
        }
    }

    public static void progressionGame() {
        var userName = Greet.greetings();
        System.out.println("What number is missing in the progression?");

        var count = 0;
        while (count < 3) {
            var result = game(userName);
            if(result){
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
