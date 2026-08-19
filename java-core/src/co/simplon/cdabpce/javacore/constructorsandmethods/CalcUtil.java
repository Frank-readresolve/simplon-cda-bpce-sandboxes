package co.simplon.cdabpce.javacore.constructorsandmethods;

/*
 * This class is a specific kind of class,
 * an utility class.
 * An utility class has no state (no instance field),
 * no need to be instantiated.
 * Exposes class constants and class/static methods.
 *
 * The add(int, int) and add(int, int, int) method
 * is overloaded (different signatures).
 * Overloading is a type of polymorphism:
 * - Same abstraction, specialized behavior
 */
public final class CalcUtil { // final = cannot be extented

    public static final double PI = 3.14;
    // no state, no instance variables/fields

    public static final String PI_STRING = "3.14";

    // public CalcUtil() {}
    private CalcUtil() { // erase the default constructor
	// not instantiable, utility class
    }

    // Signature = method name + 2 args of type int
    public static int add(int a, int b) {
	return a + b;
    }

    // Signature = method name + 3 args of type int
    public static int add(int a, int b, int c) {
	return a + b + c;
    }

    // - values: a var-args (variable number of arguments)
    // - Can be of any type, including object/reference types
    // - A method can have only one var-args
    // - If more than one argument to the method, then the var-args must be
    // declared last
    // - var-args are effectively arrays (double[] values)
    // - Caller with no parameter: add() => add([]) empty array
    public static double add(double... values) {
	double result = 0.0;
	for (double value : values) {
	    result += value;
	}
	return result;
    }

}
