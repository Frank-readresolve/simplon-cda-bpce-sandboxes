package co.simplon.cdabpce.javacore.strings;

/*
 * Strings:
 * - A string represents a sequence of characters. Unlike primitive types,
 *   "String" is a reference type: it is an instance of the "java.lang.String" class
 * - String literals are enclosed in double quotes
 * - String objects are immutable
 * - Use "equals" method to compare string contents, rather than ==, which compares object references.
 *   "equals" is inherited from "java.lang.Object" and is overriden in the "String" class
 * - String belongs to "java.lang" package, so it is automatically available without an import
 */
public class Application {

    public static void main(String[] args) {
	String literal = "ABC"; // literal String["A", "B", "C"]
	IO.println(literal == "ABC"); // boolean (should true)
	// Other solution: char['A', 'B', 'C']
	String object = new String("ABC"); // never do this, always creates a
					   // new object
	IO.println(object == "ABC"); // boolean
	IO.println(object == literal); // boolean
	// == on objects compare the reference
	// == referential comparison
	IO.println(literal.equals("ABC"));
	IO.println(object.equals("ABC"));
	IO.println(literal.equals(object));
	// Always compare objects with equals
	// equals is inherited from java.lang.Object
	IO.println("ABC".equals("ABc"));
	IO.println("ABC".equalsIgnoreCase("abc"));
	IO.println("émilie".equalsIgnoreCase("Émilie"));
	IO.println("Emilie".equals("Émilie"));
	IO.println("Emilie".equalsIgnoreCase("Émilie"));
	// Main classes override equals
	// Some classes do not override
	// "Custom" classes (business objects) should override
	// the equals method
	// equals vs "==" compare logical/natural identity
    }

}
