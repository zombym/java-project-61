package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        var choose = Engine.input("Your choice:");
        switch(choose) {
            case "1":
                Greet.greetings();
                break;
            case "2":
                Even.evenGame();
                break;
            case "3":
                Calc.calcGame();
                break;
            case "4":
                GCD.GCDGame();
                break;
            case "5":
                Progression.progressionGame();
                break;
            default:
                System.out.println("Bay");
        }
    }
}
