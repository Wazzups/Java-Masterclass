public class Sum3And5Challenge {

    public static void main(String[] args) {
        int numberSum = 0;
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                numberSum += i;
                counter++;
                System.out.println("This number: " + i + " met the conditions!");
            }

            if (counter == 5) {
                System.out.println("Reached 5 numbers!");
                break;
            }
        }

        System.out.println("The sum of the numbers that met the conditions = " + numberSum);
    }
}
