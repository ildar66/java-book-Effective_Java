/**
 * Item 67: Avoid excessive synchronization.
 * *
 * To avoid liveness and safety failures, never cede control to the client within a synchronized method or block.
 * In other words, inside a synchronized region, do not invoke a method that is designed to be overridden,
 * or one provided by a client in the form of a function object (Item 21).
 * *
 * @see chapter10.item67.Test1
 * @see chapter10.item67.Test2
 * @see chapter10.item67.Test3
 * *
 * Alien method moved outside of synchronized block - open calls {@link chapter10.item67.ObservableSet#notifyElementAdded_0(java.lang.Object)}.
 * *
 * Thread-safe observable set with CopyOnWriteArrayList: {@link chapter10.item67.ObservableSet}}(commented).
 */
package chapter10.item67;