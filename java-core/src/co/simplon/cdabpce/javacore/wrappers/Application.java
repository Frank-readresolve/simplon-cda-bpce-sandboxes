package co.simplon.cdabpce.javacore.wrappers;

/*
 * Wrapper classes:
 * - Wrapper classes are object types that represent (encapsulate) Java primitive values.
 *   They belong to "java.lang", so they are automatically available without an import
 * - Each primitive type has a corresponding wrapper class
 *   => boolean -> java.lang.Boolean
 *   => int -> java.lang.Integer
 *   => char -> java.lang.Character
 *   => ...
 * - Wrapper classes are immutable
 *
 * Why wrappers:
 * - Used in collections, actually primitives cannot be stored in List, Set...
 * - Reference types (objects) have methods, wrappers provide some useful constants (min, max)
 * - Reference types can be "null" (may be useful for validation)
 *   as a primitive type always have a value, "null" means "no value"
 *
 * Autoboxing and unboxing:
 * - Java automatically converts between primitives and their wrappers
 * - More info: https://docs.oracle.com/javase/tutorial/java/data/autoboxing.html
 */
public class Application {

    public static void main(String[] args) {
	Integer integer = new Integer(12); // never do this!
	int value = 12;
	Integer valueOf = Integer.valueOf(value);
	IO.println(valueOf == integer); // false, compares references
	IO.println(valueOf.equals(integer)); // true, compares wrapped values
	IO.println(valueOf.intValue());
	Integer valueOf2 = Integer.valueOf(value);
	IO.println(valueOf == valueOf2);
	int notNullable = 0; // != null
	Integer nullable = null;
	// auto (un)boxing
	int notBoxed = 42;
	Integer boxed = 42; // notBoxed, valueOf(42)
	int unBoxed = boxed; // boxed.intValue()
	IO.println(boxed);
	IO.println(unBoxed);
	// const a = (42).toString(), new Number(42)
	// ATTENTION!!!
	Integer mayBeNull = null;
	int whatHappensHere = mayBeNull; // Boom! NullPointerException
    }

}
