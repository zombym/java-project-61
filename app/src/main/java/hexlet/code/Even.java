package hexlet.code;

public class Even {
    public static void evenGame() {
        var userName = Greet.greetings();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        var count = 0;
        while (count < 3) {
            int result = Engine.random(1, 100);
            System.out.println("Question: " + result);
            var choose = Engine.input("Your answer:");

            String answer = (result % 2 == 0) ? "yes" : "no";
            if(answer.equals(choose)){
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + choose + "' is wrong answer ;(. Correct answer was '" + answer + "'.");
                System.out.println("Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName);
    }
}
