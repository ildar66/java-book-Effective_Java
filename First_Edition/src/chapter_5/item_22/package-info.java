/**
 * Item 22: Replace function pointers with classes and interfaces.
 * // Strategy interface
 * public interface Comparator {
 * public int compare(Object o1, Object o2);
 * }
 * This definition of the Comparator interface happens to come from the java.util package,
 * but there's nothing magic about it; you could just as well have defined it yourself. So that it is
 * applicable to comparators for objects other than strings, its compare method takes parameters
 * of type Object rather than String. Therefore, the StringLengthComparator class shown
 * earlier must be modified slightly to implement Comparator: The Object parameters must be
 * cast to String prior to invoking the length method.
 * Concrete strategy classes are often declared using anonymous classes (Item 18).
 * The following statement sorts an array of strings according to length:
 * Arrays.sort(stringArray, new Comparator() {
 * public int compare(Object o1, Object o2) {
 * String s1 = (String)o1;
 * String s2 = (String)o2;
 * return s1.length() - s2.length();
 * }
 * });
 * To summarize, the primary use of C's function pointers is to implement the Strategy pattern.
 * To implement this pattern in the Java programming language, declare an interface to represent
 * the strategy and a class that implements this interface for each concrete strategy. When a
 * concrete strategy is used only once, its class is typically declared and instantiated using an
 * anonymous class. When a concrete strategy is exported for repeated use, its class is generally
 * a private static member class, and it is exported via a public static final field whose type is the
 * strategy interface.
 */
package chapter_5.item_22;