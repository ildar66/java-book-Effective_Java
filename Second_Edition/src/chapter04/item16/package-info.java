/**
 * Item 16: Favor composition over inheritance.
 * *
 * Unlike method invocation, inheritance violates encapsulation. @see {@link chapter04.item16.InstrumentedHashSet}
 * *
 * Wrapper class - uses composition in place of inheritance: @see {@link chapter04.item16.InstrumentedSet}
 * *
 * To summarize, inheritance is powerful, but it is problematic because it violates encapsulation.
 * It is appropriate only when a genuine subtype relationship exists between the subclass and the superclass.
 * Even then, inheritance may lead to fragility if the subclass is in a different package from the superclass
 * and the superclass is not designed for inheritance.
 * To avoid this fragility, use composition and forwarding instead of inheritance, especially if an appropriate interface to implement
 * a wrapper class exists. Not only are wrapper classes more robust than subclasses, they are also more powerful.
 */
package chapter04.item16;