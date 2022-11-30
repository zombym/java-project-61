package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Greet;

public class Calc {

    static boolean game(String userName) {
        int first = Engine.random(1, 100);
        int second = Engine.random(1, 100);
        int znakPosition = Engine.random(0, 3);

        String[] znak = {"+", "-", "*"};
        int result = 0;
        switch (znak[znakPosition]) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
        }
        System.out.println("Question: " + first + " " + znak[znakPosition] + " " + second); // + " = " + result);
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

    public static void calcGame() {
        var userName = Greet.greetings();
        System.out.println("What is the result of the expression?");

        var count = 0;
        while (count < 3) {
           var result = game(userName);
            if(result){
                count++;
            } else {
                return;
            }
        }
        System.out.println("Congratulations, " + userName  + "!");
    }
}
