public class NumberPalindromeChallenge {

/* Number Palindrome
Write a method called isPalindrome with one int parameter called number.

The method needs to return a boolean.

It should return true if the number is a palindrome number otherwise it should return false. */

    public static void main(String[] args) {
        isPalindrome(-1221);
        isPalindrome(707);
    }

    public static boolean isPalindrome(int number){
        int reversed = 0;
        if (number<0 ) number *= -1;
        int numberto = number;
        while (number != 0){
            reversed *= 10;
            reversed += number% 10;
            number /= 10;
        }
        return reversed == numberto;
    }
}
