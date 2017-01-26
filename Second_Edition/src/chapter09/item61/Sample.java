package chapter09.item61;

/**
 * Sample to item61.
 */
public class Sample {
    /* // Exception Translation
    try {
        // Use lower-level abstraction to do our bidding
        ...
    } catch(LowerLevelException e) {
        throw new HigherLevelException(...);
    }*/

    /* // Here is an example of exception translation taken from the AbstractSequentialList class,
       // which is a skeletal implementation (Item 18) of the List interface.
    *//**
     * Returns the element at the specified position in this list.
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index >= size()}).
     *//*
    public E get(int index) {
        ListIterator<E> i = listIterator(index);
        try {
            return i.next();
        } catch(NoSuchElementException e) {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }*/

    /*// Exception Chaining
    try {
        ... // Use lower-level abstraction to do our bidding
    } catch (LowerLevelException cause) {
        throw new HigherLevelException(cause);
    }*/

    /*// Exception with chaining-aware constructor
    class HigherLevelException extends Exception {
        HigherLevelException(Throwable cause) {
            super(cause);
        }
    }*/
}
