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

        System.out.println("Float value range(" + Float.MIN_VALUE + " to " + Float.MAX_VALUE + ")");
        System.out.println("Double value range(" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + ")");

        /*
        * The double data type can be specified as a numeric literal with a suffix of either 'd' or 'D', but because doubles are the default in Java, the suffix is optional to use
        * The float data type can be specified as a numeric literal with a suffix of 'f' or 'F'. This suffix is required if you are assigning a real number to a variable that was declared with a float type
        * */

        float myFloatValue = 5.25F;
        double myDoubleValue = 5d;

        // Java's default data type for a decimal literal is a double, which is larger and more precise that a float
        // float myOtherFloatValue = 5.25; Will raise a error, because 5.25 is considered by java a double value and there is no cast

        /*
        * Java creators selected double as default because it's more precise, and it can handle a larger range of numbers
        */

        /*
        * Char                                          String
        * .Holds one, and only one, character           .Can hold mu  ltiple characters
        * .Literal enclosed in Single Quotes            .Literal enclosed in Double Quotes
        * */

        char myChar = 'D';

        /*
        * A char occupies two bytes of memory, or 16 bits. The char is stored as a 2 byte number
        * This number gets mapped to a single character by Java. So, when you print a char, you will see the mapped character, and note the representative number.
        * */

        /*Unicode
        * Unicode is an international encoding standard for use with different languages and scripts by which each letter, digit, or symbol is assigned a unique numeric value that applies across
        * different platforms and programs*/

        char myUnicode  = '\u0044';

        /*Assignment Type       Example code
        * a literal character   char myChar = 'D';
        * a Unicode character   char myChar = '\u0044';
        * an Integer value      char myChar = 68; */

        char mySimpleChar = '?';
        char myUnicodeChar = '\u003F';
        char myDecimalChar =  63;
    }
}
