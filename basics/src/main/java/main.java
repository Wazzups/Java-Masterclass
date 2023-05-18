public class main {

    public static void main(String[] args) {
        System.out.println("Hello, Tim");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
        }

        /* A code block allows more than one statement to be executed, in other words, a block of code */

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either of both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is a error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        /* The exclamation mark (!), or NOT operator, is also known as the logical complement operator. It can be used with a boolean variable, to test for the opposite value.*/


        /* Ternary Operator
        * The ternary operator (conditional operator) has three operands. The structure of this operator is: operand1 ? operand2 : operand3;
        * The ternary operator is a shortcut to assigning one of two values to a variable, depending on a given condition. So think of it as a shortcut of the if-then-else statement. */

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        if (isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        int ageOfClient = 20;
        String ageTest = ageOfClient >= 18 ? "Over Eithteen" : "Still a kid";
        System.out.println(ageTest);

        double myFirst = 20.00;
        double mySecond = 80.00;
        double total = (myFirst + mySecond) * 100.00;
        double remainder = total % 40.00;
        boolean thereIsRemainder = remainder == 0.00;
        if (thereIsRemainder)
            System.out.println("Got some remainder!");
    }
}
