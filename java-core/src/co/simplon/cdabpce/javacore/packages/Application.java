/*
 * Rules:
 * - A package is declared at the top of a Java source file
 * - The package declaration must appear before imports and class declarations
 * - A class belongs to exactly one package
 * - Package names are case-sensitive
 * - A package name can contain multiple components separated by "." (dot)
 *
 * Conventions:
 * - Lowercase
 * - Based on a reversed domain name for projects, e.g. "co.simplon"
 * - Structured by responsibility, e.g. "co.simplon.cdabpce.javacore",
 *   from the most general (department, service) to the most specific (library, application)
 * - Names are often formed by joining words rather than using "_"
 *   (e.g. "co.simplon.cdabpce.javacore" instead of "co.simplon.cdabpce.java_core")
 *
 * Namespace:
 * - A package acts as a namespace. It allows different packages to contain classes
 *   with the same simple/short name (e.g. Person)
 * - Fully qualified names:
 *   => co.simplon.cdabpce.javacore.packages.Person
 *   => co.simplon.cdabpce.javacore.packages.people.Person
 * - More info: https://en.wikipedia.org/wiki/Namespace
 *
 * Package vs. subpackage:
 * - Java has no special subpackage relationship
 * - "co.simplon.cdabpce.javacore.packages.people" is simply another package whose name happens
 *   to start with "co.simplon.cdabpce.javacore.packages". It does not automatically inherit classes,
 *   visibility, or other properties from "co.simplon.cdabpce.javacore.packages.people"
 */
package co.simplon.cdabpce.javacore.packages;

import java.sql.Date;

public class Application {

    public static void main(String[] args) {
	Date sqlDate = null; // "Date" from imported "java.sql.Date"
	java.util.Date utilDate = null; // We need a "Date" from "java.util",
					// not "java.sql"
	Person person = null; // default import = current package
	co.simplon.cdabpce.javacore.packages.people.Person otherPerson = null;
    }

}
