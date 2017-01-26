/**
 * Item 60: Favor the use of standard exceptions.
 * *
 * This table summarizes the most commonly reused exceptions:
 * Exception:                       |                     Occasion for Use:
 * IllegalArgumentException         | Non-null parameter value is inappropriate
 * IllegalStateException            | Object state is inappropriate for method invocation
 * NullPointerException             | Parameter value is null where prohibited
 * IndexOutOfBoundsException        | Index parameter value is out of range
 * ConcurrentModificationException  | Concurrent modification of an object has been detected where it is prohibited
 * UnsupportedOperationException    | Object does not support method
 * *
 * It would be appropriate to reuse ArithmeticException and Number-FormatException if you were implementing arithmetic.
 * Subclass an existing exception if you want to add a bit more failure-capture information (Item 63).
 * *
 * Finally, be aware that choosing which exception to reuse is not always an exact science,
 * as the occasions for use in the table above are not mutually exclusive.
 * Consider, for example, the case of an object representing a deck of cards.
 * Suppose there were a method to deal a hand from the deck that took as an argument the size of the hand.
 * Suppose the caller passed in this parameter a value that was larger than the number of cards remaining in the deck.
 * This could be construed as an IllegalArgumentException (the handSize parameter value is too high)
 * or an IllegalStateException (the deck object contains too few cards for the request).
 * In this case the IllegalArgumentException feels right, but there are no hard-and-fast rules.
 */
package chapter09.item60;