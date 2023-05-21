public class WhileLoop {

    public static void main(String[] args) {
        /* The continue statement, in its simplest form, will stop executing the current iteration of a block of code in a loop, and start a new iteration */

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }

            System.out.println(number + "_");
        }
    }

}
