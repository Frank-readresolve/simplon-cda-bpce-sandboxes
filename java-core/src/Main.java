// No package declaration on first line: default package
// => class is at the root of the build path's source folder
// => then compiled at the root of the build path's output folder
// => "src" and "bin" folder names are conventional, may have other names
// Have a look at the ".classpath" file in project's root folder
// More info: https://www.baeldung.com/javac-compile-classes-directory

/*
 * Example of "Simple Source Files and Instance Main Methods".
 * More info: https://openjdk.org/jeps/495
 */
void main() {
    System.out.println("Hello world!");
    IO.println("Hello world!"); // IO: new in Java 25
}
