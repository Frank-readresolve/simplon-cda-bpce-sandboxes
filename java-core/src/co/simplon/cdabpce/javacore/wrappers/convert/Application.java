package co.simplon.cdabpce.javacore.wrappers.convert;

/*
 * Wrapper classes provide static method to help in conversion from strings.
 */
public class Application {

    public static void main(String[] args) {
	// Reminder:
	String input = "101"; // Not 101 as int
	Integer newObj = new Integer(input); // Deprecated, bad!
	// Converts a String to an Integer wrapper object:
	Integer valueOfObj = Integer.valueOf(input); // Might be optimized
	IO.println(valueOfObj.intValue() + 1);
	// Converts a String to an int primitive:
	int primitive = Integer.parseInt(input); // base 10 by default
	IO.println(primitive + 1);
    }

}
