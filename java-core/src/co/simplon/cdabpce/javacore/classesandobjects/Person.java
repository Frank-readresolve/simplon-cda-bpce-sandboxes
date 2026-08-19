package co.simplon.cdabpce.javacore.classesandobjects;

/*
 * Class:
 * - A blueprint for creating objects
 * - A class is instantiated, the object is the instance
 * - Objects are created thanks to a constructor (initializes and returns the object)
 * - Defines the data (attributes/fields) and behavior (operations/methods)
 *   that objects (instances of the class) will have (excluding static access, see below)
 * - Defines a new type, objects are instances of that type (Person p = new Person();)
 * - Permits to represent every possible instances of the type (like an integer) with some
 *   specific operations on the type (like the addition of integers)
 * - Some classes may not have any attributes (no state), be never instantiated,
 *   utility classes generally exposing static "utility" methods
 *
 * Classes in Java:
 * - Inherit implicitly from "java.lang.Object" and its methods (e.g. "toString()")
 * - Can extend only one class, so if the class explicitly extend "java.lang.Object"
 *   it is then impossible to extend another class
 * - If a class extend another "parent" class, then the class will inherit from
 *   "java.lang.Object" indirectly from the "parent" as the parent inherits from
 *   "java.lang.Object" (B -> A -> Object)
 * - Can define static (class) and instance (object) fields and methods
 *   => Static fields and methods do not need the class to be instantiated
 *      they are accessible referencing the class (ClassName.staticField, ClassName.staticMethod())
 *   => Static field stores state shared by all class instances
 *   => Static fields are usually declared final to define constants
 *   => Instance fields store state on a per-object basis
 *   => Static fields and methods cannot access directly instance fields and methods
 *   => Instance fields and methods can directly access static fields and methods
 */
public class Person /* extends Object */ {
    // public static int majority = 18; // static = class field

    // static != constant
    // constant (java) = final
    // Naming convention for static constants:
    // SNAKE_CASE
    public static final int MAJORITY = 18;

    private static int counter = 0;

    private String name; // instance field

    private int age; // instance field

    /*
     * Builds a new Person with given name and age. Initializes the person
     * object/instance with name and age.
     */
    public Person(String name, int age) {
	// super(); // Implicit in this case
	this.name = name;
	this.age = age;
	Person.counter++;
    }

    public static int counter() {
	return Person.counter;
    }
//    public static void majority(int newValue) { // static method
//	Person.majority = newValue;
//    }

    public static int majority() { // static method
	// this (object) is not accessible
	// int maj = this.age;
	return Person.MAJORITY;
    }

    public boolean hasMajority() { // instance method
	return age >= Person.MAJORITY;
    }

    public int getAge() { // instance method
	return age;
    }

    public String getName() { // instance method
	return name;
    }

}
