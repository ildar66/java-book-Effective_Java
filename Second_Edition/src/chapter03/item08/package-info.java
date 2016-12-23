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
 * • Consistency—The fourth requirement of the equals contract says that if two objects are equal,
 * they must remain equal for all time unless one (or both) of them is modified.
 * In other words, mutable objects can be equal to different objects at different times while immutable objects can’t.
 * *
 * Whether or not a class is immutable, do not write an equals method that depends on unreliable resources.
 * • “Non-nullity”—The final requirement, which in the absence of a name I have taken the liberty of calling “non-nullity,”
 * says that all objects must be unequal to null.
 * *
 * Putting it all together, here’s a recipe for a high-quality equals method:
 * 1. Use the == operator to check if the argument is a reference to this object.
 * 2. Use the instanceof operator to check if the argument has the correct type.
 * 3. Cast the argument to the correct type.
 * 4. For each “significant” field in the class, check if that field of the argument matches the corresponding field of this object.
 * 5. When you are finished writing your equals method, ask yourself three questions: Is it symmetric? Is it transitive? Is it consistent?
 * *
 * For a concrete example of an equals method constructed according to the above recipe, see PhoneNumber.equals in Item 9.9.
 * Here are a few final caveats:
 * • Always override hashCode when you override equals (Item 9).
 * • Don’t try to be too clever.
 * • Don’t substitute another type for Object in the equals declaration(Consistent use of the @Override annotation).
 */
package chapter03.item08;