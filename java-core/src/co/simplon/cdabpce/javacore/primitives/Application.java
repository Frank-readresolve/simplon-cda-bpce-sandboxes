package co.simplon.cdabpce.javacore.primitives;

/*
 * Type:
 * - A type defines the kind of value a variable can hold and the operations
 *   that can be performed on that value
 * - Java types are broadly divided into primitive types and reference types
 * - Primitive types represent simple values directly
 * - Primitive values are not objects and do not have methods
 * - More info on primitives in general: https://en.wikipedia.org/wiki/Primitive_data_type
 * - Learn about data sizes aka "bits": https://en.wikipedia.org/wiki/Bit
 *
 * Primitive types:
 * - Java has 8 primitive types
 * - Numeric types, all signed, defaults to "0" or "0.0"
 *   => Integer types: byte (8-bit), short (16-bit), int (32-bit), long (64-bit)
 *   => Floating-point types: float (32-bit), double (64-bit)
 * - Other types: char (unsigned UTF-16 code unit) defaults to '\u0000' and boolean (false or true) defaults to false
 * - More info: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 * - Learn about character encoding and Unicode
 *   => https://en.wikipedia.org/wiki/Character_encoding
 *   => https://en.wikipedia.org/wiki/Unicode
 * - Operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html
 *
 * Numeric literals:
 * - By default, Java interprets numeric literals as
 *   => Integer literals as int
 *   => Decimal literals as double
 * - Use a suffix when the literal must have a different floating-point or integer type
 *   => L / l for longs
 *   => F / f for flaots
 *   => D / d for doubles
 * - Convention: prefer uppercase suffixes (10L, 1.5F) because they are easier to distinguish from 1 and l
 */
public class Application {

    public static void main(String[] args) {
	byte a = 127; // 127 is an int but "a" is a byte
	// byte a = 128; // 128 is too large to fit in a byte, does not compile
	short b = 1;
	int c = 1;
	// long d = 1; // okay because 1 fits in a long
	long d = 154545645464564L; // 154545645464564 is too large to be be
				   // represented as an int, add "L" suffix
	float e = 1.0F; // 1.0 is a double but "a" is a float, add "F" suffix to
			// tell the compiler the value is a float (not a double)
	double f = 1.0; // okay, 1.0 is a double
	char g = 'A'; // Human friendly representation
	char char1 = 65; // Numeric value of 'A' in UTF-16 table
	char char2 = 66;
	char char3 = 67;
	IO.print(char1);
	IO.print(char2);
	IO.print(char3);
	IO.println('\u2639'); // unicode code point (=> ☹)
	boolean vrai = true;
	boolean faux = false;
	IO.println(vrai == faux); // compares primitive values (==, <=, >= ...)
    }

}
