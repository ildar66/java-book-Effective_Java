/**
 * Item 66: Synchronize access to shared mutable data.
 * *
 * Synchronization is required for reliable communication between threads as well as for mutual exclusion
 * (to prevent an object from being observed in an inconsistent state while it’s being modified by another thread).
 * *
 * Do not use Thread.stop.
 * *
 * Broken {@link chapter10.item66.brokenstopthread.StopThread}
 * *
 * One way to fix the problem is to synchronize access to the stopRequested field: {@link chapter10.item66.fixedstopthread1.StopThread}.
 * Synchronization has no effect unless both read and write operations are synchronized.
 * *
 * The locking in the second version of StopThread can be omitted
 * if stopRequested is declared volatile: {@link chapter10.item66.fixedstopthread2.StopThread}.
 * *
 * Either share immutable data (Item 15), or don’t share at all.
 * In other words, confine mutable data to a single thread.
 * *
 * In summary, when multiple threads share mutable data, each thread that reads or writes the data must perform synchronization.
 * Without synchronization, there is no guarantee that one thread’s changes will be visible to another.
 * The penalties for failing to synchronize shared mutable data are liveness and safety failures.
 * These failures are among the most difficult to debug.
 * They can be intermittent and timing-dependent, and program behavior can vary radically from one VM to another.
 * If you need only inter-thread communication, and not mutual exclusion,
 * the volatile modifier is an acceptable form of synchronization, but it can be tricky to use correctly.
 */
package chapter10.item66;