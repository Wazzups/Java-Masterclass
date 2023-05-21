public class LocalVariableAndScope {

    public static void main(String[] args) {

        int firstVariable = 5;
        int secondVariable = 10;

        if (firstVariable > 0) { // Flow statement block starts inner block
            System.out.println(secondVariable); // inner block code has access to outer block's varables.
        }
    }

    /* A local variable is called local, because it is available for use by the code block in which it was declared. Local variables are a way to store and manipulate temporary data.
    *
    * Scope describes the accessibility of a variable.
    * -> 'In Scope' means the variable can be used by an executing block or any nested blocks.
    * -> 'Out of Scope' means the variable is no longer available. */

    /* Scope Best Practices
    * Declare and initialize variables in the same place if possible. And to declare variables in the narrowest scope possible.
    * */
}
