public class TeenNumberCheckerChallenge {

/* Teen Number Checker
We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).

Write a method named hasTeen with 3 parameters of type int.

The method should return boolean, and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false. */

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    private static boolean isTeen(int number) {
        return number >= 13 && number <= 19;
    }
}
