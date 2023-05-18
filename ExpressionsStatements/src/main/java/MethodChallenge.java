public class MethodChallenge {

    public static void main(String[] args) {
        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Bob", calculateHighScorePosition(1000));
        displayHighScorePosition("Percy", calculateHighScorePosition(500));
        displayHighScorePosition("Gilberto", calculateHighScorePosition(100));
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score list!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highScorePosition;

        if (playerScore >= 1000) {
            highScorePosition = 1;
        } else if (playerScore >= 500) {
            highScorePosition = 2;
        } else if (playerScore >= 100) {
            highScorePosition = 3;
        } else {
            highScorePosition = 4;
        }

        return highScorePosition;
    }
}
