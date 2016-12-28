/**
 * Item 12: Consider implementing Comparable.
 * *
 * The general contract of the compareTo method is similar to that of equals:
 * 1) The first provision says that if you reverse the direction of a comparison between two object references, the expected thing happens:
 * if the first object is less than the second, then the second must be greater than the first;
 * if the first object is equal to the second, then the second must be equal to the first;
 * and if the first object is greater than the second, then the second must be less than the first.
 * 2) The second provision says that if one object is greater than a second, and the second is greater than a third,
 * then the first must be greater than the third.
 * 3) The final provision says that all objects that compare as equal must yield the same results when compared to any other object.
 * *
 * One consequence of these three provisions is that the equality test imposed by a compareTo method must obey the same restrictions
 * imposed by the equals contract: reflexivity, symmetry, and transitivity.
 * Therefore the same caveat applies:
 * there is no way to extend an instantiable class with a new value component while preserving the compareTo contract,
 * unless you are willing to forgo the benefits of object-oriented abstraction (Item 8).
 * *
 * If a class has multiple significant fields, the order in which you compare them is critical.
 * @see chapter03.item12.PhoneNumber
 * You must start with the most significant field and work your way down.
 * *
 */
package chapter03.item12;