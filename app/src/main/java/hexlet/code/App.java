package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner chooseObj = new Scanner(System.in);
        String choose = chooseObj.nextLine();
        System.out.println("Your choice: " + choose);
        switch(choose) {
            case "1":
                Greet.sayHello();
                break;
            case "2":
                Even.Question();
                break;
            default:
                System.out.println("Bay");
        }
    }
}
