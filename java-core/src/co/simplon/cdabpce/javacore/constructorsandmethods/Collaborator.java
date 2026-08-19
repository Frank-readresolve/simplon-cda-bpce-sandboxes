package co.simplon.cdabpce.javacore.constructorsandmethods;

/*
 * Constructors:
 * - Kind of method that initializes and returnsan instance
 *   of the class
 * - Have a name (may be default name) and may have arguments
 *
 * In Java:
 * - Must have the same name as the class and the file
 * - May have multiple constructors in the class
 *   but with different arguments (number, type and order)
 *   => Signature of the construtor is unique
 * - Do not have a declared return type, returns implicitly
 *   the type of the class
 * - Default (not declared) no-arg and public constructor
 * - As soon as a constructor with at least 1 argument,
 *   Java does not add the default constructor
 * - Initializes instance variables with default values
 *   or null (objects)
 * - A constructor can call another constructor with this(),
 *   this() must match a consructor signature
 */
public class Collaborator {

    private static final String DEFAULT_IDENTIFIER = "DEFAULT";

    private String identifier; // String is a type (object)

    private String name;

    private int salary; // int is a primitive

    // Signature = constructor name + no-arg
    public Collaborator() {
	this(Collaborator.DEFAULT_IDENTIFIER, "UNKNOWN", 0);
    }

    // Signature = constructor name + 3 args
    public Collaborator(String identifier, String name, int salary) {
	super();
	this.identifier = identifier;
	this.name = name;
	this.salary = salary;
    }

    // Signature = constructor name + 2 args
    public Collaborator(String identifier, String name) {
	this(identifier, name, 1000);
    }

    // Signature = constructor name + 2 args + distinct types
    public Collaborator(String name, int salary) {
	this(Collaborator.DEFAULT_IDENTIFIER, name, salary);
    }

    // Signature = constructor name + 2 args + different orders
    public Collaborator(int salary, String name) {
	this(Collaborator.DEFAULT_IDENTIFIER, name, salary);
    }
//    public void Collaborator(String name) {
//	//
//    }

    public String getIdentifier() {
	return identifier;
    }

    public String getName() {
	return name;
    }

    public int getSalary() {
	return salary;
    }

}
