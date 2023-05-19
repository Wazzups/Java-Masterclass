public class MethodOverloading {

    /* Method Overloading
    * Method overloading occurs when a class has multiple methods, with the same name, but the methods are declared with different parameters.
    * Java can resolve which method it needs to execute, based on the arguments being passed, when the method is invoked.  */

    /* A method signature consists of the name of the method, and the uniqueness of the declaration of its parameters. A method's return type is not part of the signature.
    * The type, order and number of parameters, in conjunction with the name, make a method signature unique.
    * Parameter names are not important when determining if a method is overloaded */

    public static void doSomething(int parameterA){ }

    public static void doSomething(float parameterA){ }

    public static void doSomething(int parameterA, int parameterB){ }

    public static void doSomething(float parameterA, int parameterB){ }

    public static void doSomething(int parameterA, int parameterB, int parameterC){ }

}
