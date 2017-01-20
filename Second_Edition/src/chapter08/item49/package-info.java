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
 * Hideously slow program: {@link chapter08.item49.Unbelievable#main(java.lang.String[])}
 */
package chapter08.item49;