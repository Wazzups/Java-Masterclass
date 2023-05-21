public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(1345));
     }

    public static int sumDigits(int number) {
        if (number <= 0) {
            return -1;
        } else {
            int sum = 0;
            while (number > 1) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }

    /* The while loop checks the condition at the start, before executing the block. Compare that to the do while loop, where the code is executed at least once, and then the condition is checked*/

    // -> Check for endless, or infinite loops
    // -> Check for conditions where a loop will never execute

    /*
    * The continue and break statement both interrupt normal loop precessing
    * The continue statement start a new iteration, but continues to iterate through the loop
    *
    * The break statement exits the loop, at the point it's executed, and no longer completes any code in the loop, and won't continue iterating any longer.*/
}
