/**
 * Item 71: Use lazy initialization judiciously.
 * *
 * Under most circumstances, normal initialization is preferable to lazy initialization.
 * @see chapter10.item71.Initialization
 * If you need to use lazy initialization for performance on an instance field, use the double-check idiom.
 * Single-check idiom can cause repeated initialization!
 * It is critical that the field be declared "volatile".
 * *
 * If you don’t care whether every thread recalculates the value of a field,
 * and thetype of the field is a primitive other than long or double,
 * then you may choose to remove the "volatile" modifier from the field declaration in the single-check idiom.
 * This variant is known as the racy single-check idiom.
 * *
 * In summary, you should initialize most fields normally, not lazily.
 * If you must initialize a field lazily in order to achieve your performance goals, or to break a harmful initialization circularity,
 * then use the appropriate lazy initialization technique:
 * For instance fields, it is the double-check idiom: {@link chapter10.item71.Initialization#getField4()}
 * for static fields, the lazy initialization holder class idiom: {@link chapter10.item71.Initialization#getField3()}
 * For instance fields that can tolerate repeated initialization,
 * you may also consider the single-check idiom: {@link chapter10.item71.Initialization#getField5()}
 */
package chapter10.item71;