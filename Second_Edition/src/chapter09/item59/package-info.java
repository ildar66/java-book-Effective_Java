/**
 * Item 59: Avoid unnecessary use of checked exceptions.
 * *
 * One technique for turning a checked exception into an unchecked exception is:
 * @see chapter09.item59.Sample
 * *
 * If an object is to be accessed concurrently without external synchronization
 * or it is subject to externally induced state transitions, this refactoring is inappropriate,
 */
package chapter09.item59;