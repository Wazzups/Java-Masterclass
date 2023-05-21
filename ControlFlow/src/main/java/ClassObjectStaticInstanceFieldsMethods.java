public class ClassObjectStaticInstanceFieldsMethods {

    /* A class is like an empty form that gets copied and handed out.
    An object is called an instance of a particular class. */

    /* An object is created by 'instantiating' a class. Object and instance are interchangeable terms.
    * You can create many objects using a single class. Each may have unique attributes of values. */

    /* The most common way to create an object, is to use the new keyword. The new keyword creates an instance, and you can sometimes pass data, when creating an instance (constructor). */

    // The String is special because we can create a String, just by using a literal which we've seen.

    public static void main(String[] args) {
        String s = "Hello";
        // or
        String ss = new String("Hello");
    }

    /*    Static filed
    * -> Requires 'static' keyword when declared on the class.
    * -> Value of the field is stored in special memory location and only in one place.
    * -> Value is accessed by ClasName.fieldname Example: Integer.MAX_VALUE / Integer.parseInt("123"); */

    /*    Instance Field
    * -> Omits 'static' keyword when declared on the class.
    * -> Value of the field is not allocated any memory and has no value until the object is created.
    * -> Value is accessed by object.fieldname Example: object is our variable name for an object we create and myFieldName is an attribute on the class. "hello".toUpperCase();*/


}
