/**
 * Item 8: Obey the general contract when overriding equals.
 * *
 * Not to override the equals method if:
 * • Each instance of the class is inherently unique (like Thread or Object).
 * • You don’t care whether the class provides a “logical equality” test (like java.util.Random or most utility classes).
 * • A superclass has already overridden equals, and the superclass behavior is appropriate for this class.
 * • The class is private or package-private, and you are certain that its equals method will never be invoked.
 * *
 * When you override the equals method:
 * • Reflexivity—The first requirement says merely that an object must be equal to itself.
 * • Symmetry—The second requirement says that any two objects must agree on whether they are equal.
 * Once you’ve violated the equals contract, you simply don’t know how other objects will behave when confronted with your object.
 * see {@link chapter03.item08.CaseInsensitiveString}
 */
package chapter03.item08;