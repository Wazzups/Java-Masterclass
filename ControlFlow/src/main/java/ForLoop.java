public class ForLoop {
    /* For -> The for loop is more complex to set up but is commonly used when you are iterating over a set of values.
    *  While -> The while loop execute until a specified condition becomes false.
    *  do while -> The do while loop always executes at leat one and continues until a specified condition becomes false */

    /*
    * for (init; exoression; increment) {
    *   // block of statements
    * } */

    public static void main(String[] args) {

        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }

        System.out.println("10000 at 2% interest = " + calculateInterest(10000, 2.0));

        for (double interestRate = 2.0; interestRate <= 5.0; interestRate++) {
            System.out.println("10000 at " + interestRate + "% interest = " + calculateInterest(10000, interestRate));
        }

        for (double interestRate = 7.5; interestRate <= 10; interestRate += 0.25) {
            System.out.println("100 at " + interestRate + "% interest = " + calculateInterest(100, interestRate));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
