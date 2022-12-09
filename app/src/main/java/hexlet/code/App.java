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
        switch (choose) {
            case "1":
                Cli.greetings();
                break;
            case "2":
                Engine.run("Answer 'yes' if the number is even, otherwise answer 'no'.", Even.evenDataGenerate());
                break;
            case "3":
                Engine.run("What is the result of the expression?", Calc.calcDataGenerate());
                break;
            case "4":
                Engine.run("Find the greatest common divisor of given numbers.", GCD.gcdDataGenerate());
                break;
            case "5":
                Engine.run("What number is missing in the progression?", Progression.progressionDataGenerate());
                break;
            case "6":
                Engine.run("Answer 'yes' if given number is prime. Otherwise answer 'no'.", Prime.primeDataGenerate());
                break;
            default:
                System.out.println("Bay");
        }
    }
}
