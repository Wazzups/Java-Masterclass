public class DecimalComparatorChallenge {

/*  DecimalComparator
Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

The method should return boolean, and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false. */

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        return (int) (num1 * 1000) == (int) (num2 * 1000);
    }

}
