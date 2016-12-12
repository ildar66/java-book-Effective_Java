/**
 * Item 18: Favor static member classes over nonstatic.
 *
 * A nested class is a class defined within another class.
 * A nested classes should exist only to serve its enclosing class.
 * If a nested class would be useful in some other context, then it should be a top-level class.
 * There are four kinds of nested classes:
 *      static member classes,
 *      nonstatic member classes,
 *      anonymous classes, and local classes.
 *      All but the first kind are known as inner classes.
 *
 * One common use of a static member class is as a public auxiliary class, useful only in conjunction with its outer class.
 * For example, consider a typesafe enum describing the operations supported by a calculator (Item 21).
 * The Operation class should be a public static member class of the Calculator class. Clients of the Calculator class could then refer to
 * operations using names like Calculator.Operation.PLUS and Calculator.Operation.MINUS. This use is demonstrated later in this item.
 *
 * One common use of a nonstatic member class is to define an Adapter [Gamma98, p.139] that allows an instance of the outer class
 * to be viewed as an instance of some unrelated class. For example, implementations of the Map interface typically use nonstatic member classes
 * to implement their collection views, which are returned by Map's keySet, entrySet, and values methods. @see {@link chapter_4.item_18.MySet}
 *
 * If you declare a member class that does not require access to an enclosing instance, remember to put the static modifier in the declaration.
 */
package chapter_4.item_18;