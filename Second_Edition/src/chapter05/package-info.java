/**
 * Generics.
 * *
 * In release 1.5, generics were added to Java.
 * Before generics, you had to cast every object you read from a collection.
 * If someone accidentally inserted an object of the wrong type, casts could fail at runtime.
 * With generics, you tell the compiler what types of objects are permitted in each collection.
 * The compiler inserts casts for you automatically and tells you at compile time if you try to insert an object of the wrong type.
 * This results in programs that are both safer and clearer, but these benefits come with complications.
 * This chapter tells you how to maximize the benefits and minimize the complications.
 * *
 * For quick reference, the terms introduced in this item (and a few introduced elsewhere in this chapter)
 * are summarized in the following table:
 * Term:                                    Example:                           Item:
 * Parameterized type                   List<String>                    Item 23
 * Actual type parameter                String                          Item 23
 * Generic type                         List<E>                         Items 23, 26
 * Formal type parameter                E                               Item 23
 * Unbounded wildcard type              List<?>                         Item 23
 * Raw type                             List                            Item 23
 * Bounded type parameter               <E extends Number>              Item 26
 * Recursive type bound                 <T extends Comparable<T>>       Item 27
 * Bounded wildcard type                List<? extends Number>          Item 28
 * Generic method                    static <E> List<E> asList(E[] a)   Item 27
 * Type token                           String.class                    Item 29
 */
package chapter05;