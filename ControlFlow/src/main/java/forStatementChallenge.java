public class forStatementChallenge {

    public static void main(String[] args) {
        System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number!");

        int counter = 0;
        for (int number = 100; number <= 1000; number++) {
            if (isPrime(number)) {
                counter++;
                System.out.println(number + " is a prime number!");

                if (counter == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for (int div = 2; div < wholeNumber; div++) {
            if (wholeNumber % div == 0) {
                return false;
            }
        }

        return true;
    }
}
