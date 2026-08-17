package co.simplon.cdabpce.javacore.strings.concatenation;

/*
 * Reminder: strings are backed by arrays of bytes and immutable.
 * The Java compiler and execution environment may do some optimization
 * but we should not rely on it.
 *
 * Concatenation:
 * - Operator: "+", will concatenate if at least one operand is a string
 * - Each time 2 strings are concatenated, a new String might be constructed
 *
 * Solution:
 * - Use StringBuilder, mainly in loops or any dynamic construction of strings
 * - Acts like a "buffer" which may be fine tuned with the initial capacity (default 16 characters)
 * - It is not always relevant to use a "buffer" (e.g. concatenate 2 strings)
 */
public class Application {

    public static void main(String[] args) {
	String a = "ABC";
	String b = "DEF";
	String ab = a + b;
	IO.println(a); // Not changed
	IO.println(b); // Not changed
	// Conceptually:
	// ["A", "B", "C"] + ["D", "E", "F"]
	// => ["A", "B", "C", "D", "E", "F"]
	IO.println(ab); // New String object
	String c = ab + "GHI";
	IO.println(c);
	// StringBuilder
	StringBuilder sb = new StringBuilder(1024);
	String[] strings = { "A", "B", "C" }; // strings.length
	// String concatenated = "";
	int i = 0;
	for (String string : strings) { // loop over strings (array)
	    // concatenated += string; // New String object each iteration
	    sb.append(string);
	    sb.append(i);
	    i++;
	}
	// IO.println("Result: " + concatenated);
	String result = "Result: " + sb.toString(); // Converts "buffer" to
						    // String
	IO.println(result.toString());
	IO.println(result); // toString is called by the method println
    }

}
