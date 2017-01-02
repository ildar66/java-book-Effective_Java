/**
 * Item 17: Design and document for inheritance or else prohibit it.
 * *
 * The class must document its self-use of overridable methods.
 * By convention, a method that invokes overridable methods contains a description of these invocations at the end of its documentation comment.
 * The description begins with the phrase “This implementation.”
 * *
 * A class may have to provide hooks into its internal workings in the form of judiciously chosen protected methods.
 * *
 * The only way to test a class designed for inheritance is to write subclasses.
 * You must test your class by writing subclasses before you release it.
 * *
 * Constructors must not invoke overridable methods. @see {@link chapter04.item17.Sub}
 * *
 * Neither clone nor readObject may invoke an overridable method, directly or indirectly.
 * *
 * Designing a class for inheritance places substantial limitations on the class.
 * *
 * But what about ordinary concrete classes? Traditionally, they are neither final nor designed and documented for subclassing
 * The best solution to this problem is to prohibit subclassing in classes that are not designed and documented to be safely subclassed.
 * *
 * Eliminate the class’s self-use of overridable methods entirely.
 * You can eliminate a class’s self-use of overridable methods mechanically, without changing its behavior.
 * Move the body of each overridable method to a private “helper method” and have each overridable method invoke its private helper method.
 * Then replace each self-use of an overridable method with a direct invocation of the overridable method’s private helper method.
 */
package chapter04.item17;