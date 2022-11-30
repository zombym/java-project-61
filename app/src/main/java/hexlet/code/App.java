package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
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
            default:
                System.out.println("Bay");
        }
    }
}
