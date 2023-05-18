public class KeywordsExpressions {
    public static void main(String[] args) {
        /*
        * The Expression - An expression computes to a single value.
        * The Statement - Statements are standalone units of work.
        * Code Blocks - A code block is a set of zero, one, or more statements, usually grouped together in some way to achieve a single goal. */

        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
            highScore = 1000 + highScore;
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore-= 1000;
        }


    }

}