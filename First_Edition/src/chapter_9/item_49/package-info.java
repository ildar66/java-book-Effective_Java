/**
 * Item 49: Avoid excessive synchronization.
 * *
 * To avoid the risk of deadlock, never cede control to the client within a synchronized method or block.
 * *
 * As a rule, you should do as little work as possible inside synchronized regions.
 * see {@link chapter_9.item_49.WorkQueue} commented "Open call".
 * *
 * In summary, to avoid deadlock and data corruption, never call an alien method from within a
 * synchronized region. More generally, try to limit the amount of work that you do from within
 * synchronized regions. When you are designing a mutable class, think about whether it should
 * do its own synchronization. The cost savings that you can hope to achieve by dispensing with
 * synchronization is no longer huge, but it is measurable. Base your decision on whether the
 * primary use of the abstraction will be multithreaded, and document your decision clearly.
 */
package chapter_9.item_49;