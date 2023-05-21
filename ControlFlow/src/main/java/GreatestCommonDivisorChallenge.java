public class GreatestCommonDivisorChallenge {

/* Greatest Common Divisor
Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
The method should return the greatest common divisor of the two numbers (int).
The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder). */

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        } else {
            int biggestNumber = first > second ? first : second;
            int getGreatestCommonDivisor = 0;
            for (int i = 1; i <= biggestNumber; i++) {
                if ((first % i == 0) && (second % i == 0)) {
                    getGreatestCommonDivisor = i;
                }
            }

            return getGreatestCommonDivisor;
        }
    }
}
