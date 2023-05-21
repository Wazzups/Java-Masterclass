public class LastDigitCheckerChallenge {

/* Last Digit Checker
Write a method named hasSameLastDigit with three parameters of type int.
Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.*/

    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {
            int n1Rest = number1 % 10;
            int n2Rest = number2 % 10;
            int n3Rest = number3 % 10;
            return (n1Rest == n2Rest || n1Rest == n3Rest || n2Rest == n3Rest);
        }

        return false;
    }
}
