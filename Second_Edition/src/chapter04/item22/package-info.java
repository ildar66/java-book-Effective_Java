/**
 * Item 22: Favor static member classes over nonstatic.
 * *
 * There are four kinds of nested classes: static member classes, nonstatic member classes, anonymous classes, and local classes.
 * All but the first kind are known as inner classes.
 * *
 * Typical use of a nonstatic member class: {@link chapter04.item22.MySet}.
 * *
 * If you declare a member class that does not require access to an enclosing instance, always put the static modifier in its declaration.
 * *
 * To recap, there are four different kinds of nested classes, and each has its place.
 * If a nested class needs to be visible outside of a single method or is too long to fit comfortably inside a method, use a member class.
 * If each instance of the member class needs a reference to its enclosing instance, make it nonstatic; otherwise, make it static.
 * Assuming the class belongs inside a method, if you need to create instances from only one location and there is a preexisting type
 * that characterizes the class, make it an anonymous class; otherwise, make it a local class.
 */
package chapter04.item22;