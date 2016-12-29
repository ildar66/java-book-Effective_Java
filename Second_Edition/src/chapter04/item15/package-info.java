/**
 * Item 15: Minimize mutability.
 * *
 * To make a class immutable, follow these five rules:
 * 1. Don’t provide any methods that modify the object’s state (known as mutators).
 * 2. Ensure that the class can’t be extended.
 * 3. Make all fields final.
 * 4. Make all fields private.
 * 5. Ensure exclusive access to any mutable components.
 * *
 * Many of the example classes in previous items are immutable. One such class is @see {@link chapter03.item09.PhoneNumber} in Item 9,
 * which has accessors for each attribute but no corresponding mutators.
 * @see chapter04.item15.alternative.Complex a slightly more complex example.
 * *
 * Immutable objects are simple.
 * Immutable objects are inherently thread-safe; they require no synchronization.
 * Immutable objects can be shared freely.
 * Not only can you share immutable objects, but you can share their internals.
 * Immutable objects make great building blocks for other objects.
 * *
 * The only real disadvantage of immutable classes is that they require a separate object for each distinct value.
 * *
 * The alternative to making an immutable class final is to make all of its constructors private or package-private,
 * and to add public static factories in place of the public constructors (Item 1). @see {@link chapter04.item15.Complex}.
 * *
 * To summarize, resist the urge to write a set method for every get method.
 * Classes should be immutable unless there’s a very good reason to make them mutable.
 * If a class cannot be made immutable, limit its mutability as much as possible.
 * Make every field final unless there is a compelling reason to make it nonfinal.
 */
package chapter04.item15;