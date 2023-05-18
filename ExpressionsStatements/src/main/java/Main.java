public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }

    /*
    * if(firstCondition){
    *   // Code in block will execute only if firstCondition is true
    * } else if(secondCondition) {
    *   // Code in block will execute if firstCondition is false and secondCondition is true
    * } else {
    *   // Code in block will execute if all condition above are false. The Else block is optional and must be last.
    * }
    * */

}
