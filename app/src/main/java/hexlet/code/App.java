package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;


public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        var choose = Engine.input("Your choice:");
        String userName = "";
        String answer = "";
        switch (choose) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                userName = Engine.greetings();
                answer = Engine.input("Your answer:");
                Even.game("Answer 'yes' if the number is even, otherwise answer 'no'.", userName, answer);
                break;
            case "3":
                userName = Engine.greetings();
                answer = Engine.input("Your answer:");
                Calc.game("What is the result of the expression?", userName, answer);
                break;
            case "4":
                userName = Engine.greetings();
                answer = Engine.input("Your answer:");
                GCD.game("Find the greatest common divisor of given numbers.", userName, answer);
                break;
            case "5":
                userName = Engine.greetings();
                answer = Engine.input("Your answer:");
                Progression.game("What number is missing in the progression?", userName, answer);
                break;
            case "6":
                userName = Engine.greetings();
                answer = Engine.input("Your answer:");
                Prime.game("Answer 'yes' if given number is prime. Otherwise answer 'no'.", userName, answer);
                break;
            default:
                System.out.println("Bay");
        }
    }
}
