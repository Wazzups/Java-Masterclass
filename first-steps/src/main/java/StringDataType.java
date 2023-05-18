public class StringDataType {

    public static void main(String[] args) {
        /* A String is a class that contains a sequence of characters */

        String myString = "This is a string";

        System.out.println("myString = " + myString);

        myString += ", and this is more.";
        System.out.println("myString is equal to " + myString);

        int myInt = Integer.parseInt("10");

        /* String are immutable
        * Ummutable means that you can't change a String after it's created.
        *
        * int myInt = 47
        * String myLastString = "120.";
        * myLastString = myLastString + myInt;
        *
        * The value 120.47 is technically not appended to the curent contents of lastString.
        * Instead, a new String is created automatically by Java. The new value is re-assigned to the string variable
        * */

        /* The String class is immutable.
        *  The StringBuilder class is mutable, but does not share the String's special features such as being able to assign it a String
        * literal or use the + operator on it */


    }
}
