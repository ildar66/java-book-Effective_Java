/**
 * Item 49: Prefer primitive types to boxed primitives.
 * *
 * Broken comparator: {@link chapter08.item49.BrokenComparator}.
 * Applying the == operator to boxed primitives is almost always wrong.
 * Fixed Comparator(commented).
 * *
 * When you mix primitives and boxed primitives in a single operation, the boxed primitive is auto-unboxed.
 * If a null object reference is auto-unboxed, you get a NullPointerException. {@link chapter08.item49.Unbelievable#main_0(java.lang.String[])}.
 * *
 * Hideously slow program: {@link chapter08.item49.Unbelievable#main(java.lang.String[])}.
 * *
 * In summary, use primitives in preference to boxed primitives whenever you have the choice. Primitive types are simpler and faster.
 * If you must use boxed primitives, be careful! Autoboxing reduces the verbosity, but not the danger, of using boxed primitives.
 * When your program compares two boxed primitives with the == operator, it does an identity comparison, which is almost certainly not what you want.
 * When your program does mixed-type computations involving boxed and unboxed primitives, it does unboxing,
 * and when your program does unboxing, it can throw a NullPointerException.
 * Finally, when your program boxes primitive values, it can result in costly and unnecessary object creations.
 */
package chapter08.item49;