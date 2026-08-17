package co.simplon.cdabpce.javacore.arrays;

import java.util.Arrays;

/*
 * Arrays in Java:
 * - Arrays are objects (inherit from "java.lang.Object")
 * - Arrays are "fixed-length" (not dynamic)
 *   => Need to know array length before constructing it
 * - Arrays are typed like any other data in Java (primitive or object/reference type)
 */
public class Application {

    public static void main(String[] args) {
	int[] empty = {}; // Literal / inline
	int[] notEmpty = { 0 }; // One element "0" in the array
	IO.println(empty.length); // Length is a field (not method)
	IO.println(notEmpty.length);
	int[] obj = new int[3]; // New int array of length = 3
	IO.println(obj.length);
	IO.println(obj.toString()); // Default implementation
	IO.println(Arrays.toString(obj));
	obj[0] = 1;
	IO.println(Arrays.toString(obj));
	boolean[] all = new boolean[2];
	IO.println(Arrays.toString(all));
	// int[] ints = {"ABC", 'A', true}; // Not compatible, only int element
    }

}
