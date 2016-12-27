/**
 * Item 11: Override clone judiciously.
 * *
 * If you override the clone method in a nonfinal class, you should return an object obtained by invoking super.clone.
 * *
 * In practice, a class that implements Cloneable is expected to provide a properly functioning public clone method.
 * *
 * If every field contains a primitive value or a reference to an immutable object, the returned object may be exactly what you need,
 * in which case no further processing is necessary. This is the case, for example, for the @see {@link chapter03.item11.PhoneNumber}.
 * * *
 * In effect, the clone method functions as another constructor; you must ensure that it does no harm to the original object
 * and that it properly establishes invariants on the clone.
 * In order for the clone method on @see {@link chapter03.item11.Stack} to work properly, it must copy the internals of the stack.
 * *
 * The clone architecture is incompatible with normal use of final fields referring to mutable objects,
 * except in cases where the mutable objects may be safely shared between an object and its clone.
 * *
 * It is not always sufficient to call clone recursively. @see {@link chapter03.item11.HashTable}
 */
package chapter03.item11;