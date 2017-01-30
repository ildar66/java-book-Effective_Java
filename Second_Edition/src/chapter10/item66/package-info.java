/**
 * Item 66: Synchronize access to shared mutable data.
 * *
 * Synchronization is required for reliable communication between threads as well as for mutual exclusion.
 * *
 * Do not use Thread.stop.
 * *
 * Broken {@link chapter10.item66.brokenstopthread.StopThread}
 * *
 * One way to fix the problem is to synchronize access to the stopRequested field: {@link chapter10.item66.fixedstopthread1.StopThread}.
 * Synchronization has no effect unless both read and write operations are synchronized.
 * *
 * The locking in the second version of StopThread can be omitted
 * if stopRequested is declared volatile: {@link chapter10.item66.fixedstopthread2.StopThread}
 */
package chapter10.item66;