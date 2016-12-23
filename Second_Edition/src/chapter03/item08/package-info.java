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
 * • Transitivity—The third requirement of the equals contract says that if one object is equal to a second
 * and the second object is equal to a third, then the first object must be equal to the third.
 * *
 * There is no way to extend an instantiable class and add a value component while preserving the equals contract.
 * see {@link chapter03.item08.ColorPoint}
 * *
 * Broken - violates Liskov substitution principle see {@link chapter03.item08.CounterPointTest}
 * *
 * Follow the advice of Item 16, “Favor composition over inheritance.” see {@link chapter03.item08.composition.ColorPoint}.
 */
package chapter03.item08;