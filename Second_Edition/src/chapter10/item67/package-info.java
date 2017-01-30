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
 * *
 * As a rule, you should do as little work as possible inside synchronized regions.
 * *
 * If a method modifies a static field, you must synchronize access to this field,
 * even if the method is typically used only by a single thread.
 * It is not possible for clients to perform external synchronization on such a method
 * because there can be no guarantee that unrelated clients will do likewise.
 * *
 * In summary, to avoid deadlock and data corruption, never call an alien method from within a synchronized region.
 * More generally, try to limit the amount of work that you do from within synchronized regions.
 * When you are designing a mutable class, think about whether it should do its own synchronization.
 * In the modern multicore era, it is more important than ever not to synchronize excessively.
 * Synchronize your class internally only if there is a good reason to do so, and document your decision clearly (Item 70).
 */
package chapter10.item67;