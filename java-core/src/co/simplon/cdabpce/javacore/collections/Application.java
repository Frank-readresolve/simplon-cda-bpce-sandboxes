package co.simplon.cdabpce.javacore.collections;

import java.util.ArrayList;

/*
 * Java arrays are very limited.
 * Collections are advanced data structures (List, Set, Map),
 * store objects/reference types only (no primitive).
 * => Map: dictionary, key/value, "associative arrays"-like
 * => Set: unique elements
 *
 * ArrayList (concrete implementation of a "List"):
 * - A data structure for oredered elements, order is guaranteed by the data structure
 * - Accepts "null"
 */
public class Application {

    public static void main(String[] args) {
	// elements may contain null or any "Object"
	ArrayList elements = new ArrayList();
	elements.add("A");
	elements.add("D");
	elements.add("E");
	elements.add(null);
	elements.add("C");
	elements.add("A");
	elements.add(null);
	for (Object element : elements) {
	    IO.println(element);
	}
    }

}
