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
Putting it all together, here's a recipe for a high-quality equals method:
1. Use the == operator to check if the argument is a reference to this object. If so,return true. This is just a performance optimization,
    but one that is worth doing if the comparison is potentially expensive.
2. Use the instanceof operator to check if the argument is of the correct type. If not, return false. Typically, the correct type is the class in
    which the method occurs. Occasionally, it is some interface implemented by this class. Use an interface if the class implements an interface
    that refines the equals contract to permit comparisons across classes that implement the interface. The collection interfaces Set,
    List, Map, and Map.Entry have this property.
3. Cast the argument to the correct type. Because this cast was preceded by an instanceof test, it is guaranteed to succeed.
4. For each “significant” field in the class, check to see if that field of the argument matches the corresponding field of this object.
    If all these tests succeed, return true; otherwise, return false. If the type in Step 2 is an interface, you must access
    the argument's significant fields via interface methods; if the type is a class, you may be able to access the fields directly,
    depending on their accessibility. For primitive fields whose type is not float or double, use the == operator for comparisons;
    for object reference fields, invoke the equals method recursively; for float fields, translate to int values using Float.floatToIntBits
    and compare the int values using the == operator; for double fields, translate to long values using Double.doubleToLongBits and compare
    the long values using the == operator.
    (The special treatment of float and double fields is made necessary by the existence of Float.NaN, -0.0f, and the analogous double constants;
     see the Float.equals documentation for details.) For array fields, apply these guidelines to each element. Some object reference fields may
     legitimately contain null. To avoid the possibility of a NullPointerException, use the following idiom to compare such fields:
    (field == null ? o.field == null : field.equals(o.field))
    This alternative may be faster if field and o.field are often identical object references:
    (field == o.field || (field != null && field.equals(o.field)))
    Effective Java: Programming Language Guide 30
    For some classes, like CaseInsensitiveString shown earlier, the field comparisons are more complex than simple equality tests. It should be
    apparent from the specification for a class if this is the case. If so, you may want to store a canonical form in each object, so that the equals
    method can do cheap exact comparisons on these canonical forms rather than more costly inexact comparisons. This technique is
    most appropriate for immutable classes (Item 13), as the canonical form would have to be kept up to date if the object could change.
    The performance of the equals method may be affected by the order in which fields are compared. For best performance, you should first compare
    fields that are more likely to differ, less expensive to compare, or, ideally, both. You must not compare fields that are not part of an
    object's logical state, such as Object fields used to synchronize operations. You need not compare redundant fields, which can be calculated
    from “significant fields, but doing so may improve the performance of the equals method. If a redundant field amounts to a summary description
    of the entire object, comparing this field will save you the expense of comparing the actual data if the comparison fails.
5. When you are finished writing your equals method, ask yourself three questions:
    Is it symmetric, is it transitive, and is it consistent? (The other two properties
    generally take care of themselves.) If not, figure out why these properties fail to hold,
    and modify the method accordingly.

    • Always override hashCode when you override equals (Item 8).
    • Don't try to be too clever.
    • Don't write an equals method that relies on unreliable resources.
    • Don't substitute another type for Object in the equals declaration.
    public boolean equals(MyClass o) {
        ...
    }
    The problem is that this method does not override Object.equals, whose argument is
    of type Object, but overloads it instead
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