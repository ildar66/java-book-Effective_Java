/**
 * Item 62: Document all exceptions thrown by each method.
 * *
 * Always declare checked exceptions individually,
 * and document precisely the conditions under which each one is thrown using the Javadoc @throws tag.
 * *
 * Use the Javadoc @throws tag to document each unchecked exception that a method can throw,
 * but do not use the throws keyword to include unchecked exceptions in the method declaration
 * (visual cue to help the programmer distinguish checked exceptions from unchecked).
 * *
 * If an exception is thrown by many methods in a class for the same reason,
 * it is acceptable to document the exception in the class’s documentation comment.
 * *
 * In summary, document every exception that can be thrown by each method that you write.
 * This is true for unchecked as well as checked exceptions, and for abstract as well as concrete methods.
 * Provide individual throws clauses for each checked exception and do not provide throws clauses for unchecked exceptions.
 * If you fail to document the exceptions that your methods can throw, it will be difficult or
 * impossible for others to make effective use of your classes and interfaces.
 */
package chapter09.item62;