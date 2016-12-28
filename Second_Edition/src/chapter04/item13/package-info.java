/**
 * Item 13: Minimize the accessibility of classes and members.
 * *
 * This concept, known as information hiding or encapsulation.
 * *
 * The rule of thumb is simple: make each class or member as inaccessible as possible.
 * *
 * For members (fields, methods, nested classes, and nested interfaces),
 * there are four possible access levels, listed here in order of increasing accessibility:
 * • private—The member is accessible only from the top-level class where it is declared.
 * • package-private—The member is accessible from any class in the package where it is declared.
 * Technically known as default access, this is the access level you get if no access modifier is specified.
 * • protected—The member is accessible from subclasses of the class where it is declared (subject to a few restrictions [JLS, 6.6.2])
 * and from any class in the package where it is declared.
 * • public—The member is accessible from anywhere.
 * *
 * Instance fields should never be public (Item 14).
 * Classes with public mutable fields are not thread-safe.
 * The same advice applies to static fields, with the one exception. You can expose constants via public static final fields.
 * *
 * Note that a nonzero-length array is always mutable, so it is wrong for a class to have a public static final array field,
 * or an accessor that returns such a field.
 * // Potential security hole!
 * public static final Thing[] VALUES = { ... };
 * *
 * // You can make the public array private and add a public immutable list:
 * private static final Thing[] PRIVATE_VALUES = { ... };
 * public static final List<Thing> VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
 * *
 * //Alternatively, you can make the array private and add a public method that returns a copy of a private array:
 * private static final Thing[] PRIVATE_VALUES = { ... };
 * public static final Thing[] values() { return PRIVATE_VALUES.clone(); }
 * *
 * To summarize, you should always reduce accessibility as much as possible.
 * After carefully designing a minimal public API, you should prevent any stray classes, interfaces, or members from becoming a part of the API.
 * With the exception of public static final fields, public classes should have no public fields.
 * Ensure that objects referenced by public static final fields are immutable.
 */
package chapter04.item13;