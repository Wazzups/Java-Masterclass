public class PrimitiveTypes {

    /*
    * Whole number: byte, int, short, long
    * Real number (Decimal): double, float
    * Single Character: char
    * Boolean value: boolean
    * */

    public static void main(String[] args) {
        System.out.println("Integer Max value = " + Integer.MAX_VALUE);
        System.out.println("Integer Min value = " + Integer.MIN_VALUE);

        /*
        *   A class is a building block for object-oriented programming, and allows us to build custom data types.
        *
        *   Java uses the concept of a wrapper class, for all of its eight primitive data types.
        *   A wrapper class provides simple operations, as well as some basic information about the primitive date type, which cannot be stored on the primitive itself.
        *
        *   Primitive   Wrapper Class
        *   byte        Byte
        *   short       Short
        *   char        Character
        *   int         Integer
        *   long        Long
        *   float       Float
        *   double      Double
        *   boolean     Boolean
        *
        *
        * */

        System.out.println("Busted Max integer value = " + (Integer.MAX_VALUE + 1));

        /*
        * Java provided an alternative way to improve readability, the underscore
        * */
        int myInt = 12_213_222;

        System.out.println("Byte value range(" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
        System.out.println("Short value range(" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
        System.out.println("Long value range(" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

        /*
        * Data type     Width   Min Value   Max Value
        * byte          8       -128        127
        * short         16      -32768      32767
        * int           32      -2147483648 2147483647
        */

        long myLong = 100L;

        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;

        /* Rules
        *   Cannot declare variables with different data types in a single statement
        *   If you declare multiple variables of the same data type in a single statement, you specify the data type only once before any variables names.*/

        int myTotal = (myMinIntValue / 2);

        /*  Casting in Java
        *
        * Casting means to treat or convert a number, from one type to another.
        * */

        byte myNewByteValue = (byte) (myMinByteValue / 2);
    }
}
