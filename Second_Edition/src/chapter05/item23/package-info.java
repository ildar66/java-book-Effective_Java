/**
 * Item 23: Don’t use raw types in new code.
 * *
 * If you use raw types, you lose all the safety and expressiveness benefits of generics.
 * *
 * You lose type safety if you use a raw type like List, but not if you use a parameterized type like List<Object>.
 * @see chapter05.item23.Raw
 * If you want to use a generic type but you don’t know or care what the actual type parameter is, you can use a question mark instead.
 * *
 * You must use raw types in class literals.
 * In other words, List.class, String[].class, and int.class are all legal, but List<String>.class and List<?>.class are not.
 * *
 * The second exception to the rule concerns the instanceof operator.
 * // Legitimate use of raw type - instanceof operator
 *      if (o instanceof Set) { // Raw type
 *          Set<?> m = (Set<?>) o; // Wildcard type
 *          ...
 *      }
 * *
 * In summary, using raw types can lead to exceptions at runtime, so don’t use them in new code.
 * They are provided only for compatibility and interoperability with legacy code that predates the introduction of generics.
 * *
 * As a quick review,
 * Set<Object> is a parameterized type representing a set that can contain objects of any type,
 * Set<?> is a wildcard type representing a set that can contain only objects of some unknown type, and
 * Set is a raw type, which opts out of the generic type system.
 * The first two are safe and the last is not.
 */
package chapter05.item23;