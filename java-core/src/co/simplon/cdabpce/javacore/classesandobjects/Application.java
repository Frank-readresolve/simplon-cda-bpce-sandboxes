package co.simplon.cdabpce.javacore.classesandobjects;

public class Application {

    public static void main(String[] args) {
	IO.println(Person.counter()); // Prints number of Person instance (0)
	IO.println(Person.majority); // static access (field)
	IO.println(Person.majority()); // class call (method)
	Person toto = new Person("Toto", 18); // each new = new object
	IO.println(toto.getName()); // getName returns the name of the instance
	IO.println(toto.hasMajority()); // true
	Person tutu = new Person("Tutu", 21);
	IO.println(tutu.getName()); // getName returns the name of the instance
	IO.println(tutu.hasMajority()); // true
	// Not same type (Person not a String):
	// String person = new Person(null, 0);
	// Not same type (String not a Person)
	// Person person = "Toto";
	IO.println(toto.toString()); // Default implementation
	IO.println("*****");
	// Person.majority = 22;
	// person.majority(22); // Same as Person.majority(22)
	IO.println(Person.majority());
	IO.println(toto.hasMajority()); // true
	IO.println(tutu.hasMajority()); // true
	IO.println(Person.majority());
	IO.println("*****");
	IO.println(Person.counter()); // Prints number of Person instance (2)
	// Instances have a reference to the class it is instantiated from
	Class objectClass = toto.getClass();
	String className = objectClass.getName(); // Includes the package name
	IO.println(className); // Long (full) name
    }

}
