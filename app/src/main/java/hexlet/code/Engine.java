package hexlet.code;

public class Engine {
    public static void run(String task, String[][] roundsData) {
        var userName = ComonTools.greetings();
        for (var i = 0; i < ComonTools.REPEAT_COUNT; i++) {
            ComonTools.printTask(task);
            ComonTools.printQuestion(roundsData[i][0]);
            var answer = ComonTools.input("Your answer:");
            var result = ComonTools.printAnswer(answer, roundsData[i][1], userName);
            if (!result) {
                return;
            }
        }
        ComonTools.printCongratulation(userName);
    }
}
