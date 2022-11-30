package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void Question() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        Scanner nameObj = new Scanner(System.in);

        String userName = nameObj.nextLine();
        System.out.println("Hello, " + userName);
        var count = 0;
        while (count < 3) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        System.out.println("Question: " + result);
        Scanner chooseObj = new Scanner(System.in);
        String choose = chooseObj.nextLine();
            if (result % 2 == 0) {
                if (choose.equals("yes")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + choose + "' is wrong answer ;(. Correct answer was 'yes'.");
                    System.out.println("Let's try again, " + userName);
                    return;
                }
            } else {
                if (choose.equals("no")) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + choose + "' is wrong answer ;(. Correct answer was 'no'.");
                    System.out.println("Let's try again, " + userName);
                    return;
                }
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
