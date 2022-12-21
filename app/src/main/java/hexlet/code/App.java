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
        var choose = Engine.userInput("Your choice:");
        chooseBox(choose);
    }

    public static void chooseBox(String choose) {
        switch (choose) {
            case "1" ->
                Cli.greetings();
            case "2" ->
                Even.start();
            case "3" ->
                Calc.start();
            case "4" ->
                GCD.start();
            case "5" ->
                Progression.start();
            case "6" ->
                Prime.start();
            default ->
                System.out.println("Bye");
        }
    }
}
