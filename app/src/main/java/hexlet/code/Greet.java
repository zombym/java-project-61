package hexlet.code;

public class Greet {
    public static String greetings() {
        System.out.println("Welcome to the Brain Games!");
        var userName = Engine.input("May I have your name?");
        System.out.println("Hello, " + userName);
        return userName;
    }
}
