/**
 * Item 25: Prefer lists to arrays.
 * *
 * In summary, arrays and generics have very different type rules:
 * Arrays are covariant and reified;
 * generics are invariant and erased.
 * @see chapter05.item25.Reduction
 * As a consequence, arrays provide runtime type safety but not compile-time type safety and vice versa for generics.
 * Generally speaking, arrays and generics don’t mix well. If you find yourself mixing them and getting compile-time errors or warnings,
 * your first impulse should be to replace the arrays with lists.
 */
package chapter05.item25;