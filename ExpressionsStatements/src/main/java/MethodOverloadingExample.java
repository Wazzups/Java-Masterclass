public class MethodOverloadingExample {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " score " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static void calculateScore() {
        System.out.println("No player score, no player score");
    }
}
