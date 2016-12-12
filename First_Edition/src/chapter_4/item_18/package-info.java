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
 * For example, consider a typesafe enum describing the operations supported by a @see {@link chapter_4.item_18.Calculator}.
 * The Operation class should be a public static member class of the Calculator class. Clients of the Calculator class could then refer to
 * operations using names like Calculator.Operation.PLUS and Calculator.Operation.MINUS. This use is demonstrated later in this item.
 *
 * One common use of a nonstatic member class is to define an Adapter [Gamma98, p.139] that allows an instance of the outer class
 * to be viewed as an instance of some unrelated class. For example, implementations of the Map interface typically use nonstatic member classes
 * to implement their collection views, which are returned by Map's keySet, entrySet, and values methods. @see {@link chapter_4.item_18.MySet}
 *
 * If you declare a member class that does not require access to an enclosing instance, remember to put the static modifier in the declaration.
 *
 * Anonymous classes are unlike anything else in the Java programming language. As you would expect, an anonymous class has no name.
 * It is not a member of its enclosing class. Rather than being declared along with other members, it is simultaneously declared and
 * instantiated at the point of use. Anonymous classes are permitted at any point in the code where an expression is legal.
 * Anonymous classes behave like static or nonstatic member classes depending on where they occur:
 * They have enclosing instances if they occur in a nonstatic context.
 * // Typical use of an anonymous class
     Arrays.sort(args, new Comparator() {
        public int compare(Object o1, Object o2) {
            return ((String)o1).length() - ((String)o2).length();
     }
     });
 * Another common use of an anonymous class is to create a process object, such as a Thread, Runnable, or TimerTask instance.
 * A third common use is within a static factory method (see the intArrayAsList method in Item 16).
 * A fourth common use is in the public static final field initializers of sophisticated typesafe enums that require a separate subclass
 * for each instance @see {@link chapter_4.item_18.Calculator}.
 */
/*
    To recap, there are four different kinds of nested classes, and each has its place. If a nested class needs to be visible outside of a
    single method or is too long to fit comfortably inside a method, use a member class.
    If each instance of the member class needs a reference to its enclosing instance, make it nonstatic; otherwise make it static.
    Assuming the class belongs inside a method, if you need to create instances from only one location and there is a
    preexisting type that characterizes the class, make it an anonymous class; otherwise, make it a local class.
 */
package chapter_4.item_18;