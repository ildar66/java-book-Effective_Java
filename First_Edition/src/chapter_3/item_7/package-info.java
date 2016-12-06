/*
 * Item 7: Obey the general contract when overriding equals.
 *
 * Overriding the equals method seems simple, but there are many ways to get it wrong, and
 * the consequences can be dire. The easiest way to avoid problems is not to override the equals
 * method, in which case each instance is equal only to itself. This is the right thing to do if any
 * of the following conditions apply:
 *
 * • Each instance of the class is inherently unique. This is true for classes that
 * represent active entities rather than values, such as Thread. The equals
 * implementation provided by Object has exactly the right behavior for these classes.
 *
 * • You don't care whether the class provides a “logical equality” test. For example,
 * java.util.Random could have overridden equals to check whether two Random
 * instances would produce the same sequence of random numbers going forward, but
 * the designers didn't think that clients would need or want this functionality. Under
 * these circumstances, the equals implementation inherited from Object is adequate.
 *
 * • A superclass has already overridden equals, and the behavior inherited from
 * the superclass is appropriate for this class. For example, most Set implementations
 * inherit their equals implementation from AbstractSet, List implementations from
 * AbstractList, and Map implementations from AbstractMap.
 *
 * • The class is private or package-private, and you are certain that its equals
 * method will never be invoked. Arguably, the equals method should be overridden
 * under these circumstances, in case it is accidentally invoked someday:
 *  public boolean equals(Object o) {
        throw new UnsupportedOperationException();
    }
 */
/*
    When you override the equals method, you must adhere to its general contract. Here is the contract, copied from the specification for java.lang.Object:
    The equals method implements an equivalence relation:
    • It is reflexive: For any reference value x, x.equals(x) must return true.
    • It is symmetric: For any reference values x and y, x.equals(y) must return true if
    and only if y.equals(x) returns true.
    • It is transitive: For any reference values x, y, and z, if x.equals(y) returns true and
    y.equals(z) returns true, then x.equals(z) must return true.
    • It is consistent: For any reference values x and y, multiple invocations of
    x.equals(y) consistently return true or consistently return false, provided no
    information used in equals comparisons on the object is modified.
    • For any non-null reference value x, x.equals(null) must return false.
 */
package chapter_3.item_7;