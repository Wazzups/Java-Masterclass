public class Method {

    public static void main(String[] args) {
        /* A method declares executable code that can be invoked, passing a fixed number of values as arguments
        * A method is a way of reducing code duplication.
        * A method can be executed many times with potentially different results, by passing data to the method in the form of arguments
        * Any method can be executed as a statement
        * A method that returns a value can be used as an expression, or as part of any expression */

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 100;
        int bonus = 100;

        int highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("The highScore is " + highScore);

    }

    /* To execute a method that's defined with parameters, you have to pass variables, values, or expressions that match the type, order and number of the parameters declared. */

    /* Java states that a return statement returns control to the invoker of a method. Common usage is to return a value back from a method.
    * A method declared with void as the return type doesn't return anything.*/
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    /* The calling code must pass the same number of arguments, as the number os parameters declared.
    *  The calling code must pass arguments to the method, with the same or comparable type and in the same order, as the declaration. */

    // A method is uniquely defined in a class by its name, and the number and type of parameters that are declared for it. Can have multiple methods with the same name, as long
    // as the method signature are different.
}
