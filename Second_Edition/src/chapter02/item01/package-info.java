/**
 * Item 1: Consider static factory methods instead of constructors.
 * *
 * One advantage of static factory methods is that, unlike constructors, they have names.
 * *
 * A second advantage of static factory methods is that, unlike constructors,
 * they are not required to create a new object each time they’re invoked.
 * *
 * A third advantage of static factory methods is that, unlike constructors,
 * they can return an object of any subtype of their return type.
 * *
 * A fourth advantage of static factory methods is that they reduce the verbosity of creating parameterized type instances(java release 1.6).
 * *
 * The main disadvantage of providing only static factory methods is that classes without public or protected constructors cannot be subclassed.
 * *
 * A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.
 * Here are some common names for static factory methods:
 * • valueOf—Returns an instance that has, loosely speaking, the same value as its parameters.
 * Such static factories are effectively type-conversion methods.
 * • of—A concise alternative to valueOf, popularized by EnumSet (Item 32).
 * • getInstance—Returns an instance that is described by the parameters but cannot be said to have the same value.
 * In the case of a singleton, getInstance takes no parameters and returns the sole instance.
 * • newInstance—Like getInstance, except that newInstance guarantees that each instance returned is distinct from all others.
 * • getType—Like getInstance, but used when the factory method is in a different class.
 * Type indicates the type of object returned by the factory method.
 * • newType—Like newInstance, but used when the factory method is in a different class.
 * Type indicates the type of object returned by the factory method.
 * *
 * In summary, static factory methods and public constructors both have their uses, and it pays to understand their relative merits.
 * Often static factories are preferable, so avoid the reflex to provide public constructors without first considering static factories.
 */
package chapter02.item01;