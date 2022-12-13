package hexlet.code;

public class Engine {
    public static void run(String task, String[][] roundsData) {
        var userName = CommonTools.greetings();
        for (var i = 0; i < CommonTools.REPEAT_COUNT; i++) {
            CommonTools.printTask(task);
            CommonTools.printQuestion(roundsData[i][0]);
            var answer = CommonTools.input("Your answer:");
            var result = CommonTools.printAnswer(answer, roundsData[i][1], userName);
            if (!result) {
                return;
            }
        }
        CommonTools.printCongratulation(userName);
    }
}
