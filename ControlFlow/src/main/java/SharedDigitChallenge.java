public class SharedDigitChallenge {

/* Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false. */

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10 && number1 <= 99) && (number2 >= 10 && number2 <= 99)) {
            int restNumber1 = number1 % 10;
            int restNumber2 = number2 % 10;
            int divNumber1 = number1 / 10;
            int divNumber2 = number2 / 10;

            return ((restNumber1 == restNumber2) || (restNumber1 == divNumber2) || (divNumber1 == restNumber2) || (divNumber1 == divNumber2));
        }

        return false;
    }
}
