public class OperatorsOperandsAndExpressions {

    public static void main(String[] args) {
        /* An operand is a term used to describe any object that is manipulated by an operator.
        *   int myVar = 15 + 12;
        * The plus here is the operator, and 15 and 12 are the operands.*/

        /* An expression is formed by combining variables, literals, method return values and operators. */

       char firstChar = 'A';
       char secondChar = 'B';

        System.out.println(firstChar + secondChar); // it add two char variables
        System.out.println("" + firstChar + secondChar); // it concatenates the char variables to a string literal


        /* Shorthand Operator                           Code Sample
        *  Post-fix increment Operator                  result++;
        *  Compound assignment operator with + sign     result+= 1;
        *
        * Decrementing is the same but with the operator minus
        * */

        int result = 10;
        result++;
        System.out.println(result);
        result += 1;
        System.out.println();
    }
}
