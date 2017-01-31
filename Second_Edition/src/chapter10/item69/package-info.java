/**
 * Item 69: Prefer concurrency utilities to wait and notify.
 * *
 * Given the difficulty of using wait and notify correctly, you should use the higher-level concurrency utilities instead.
 * *
 * For example, this {@link chapter10.item69.Intern} simulates the behavior of String.intern.
 * *
 * Use ConcurrentHashMap in preference to Collections.synchronizedMap or Hashtable.
 * Simply replacing old-style synchronized maps with concurrent maps can dramatically increase the performance of concurrent applications.
 * *
 * Simple framework for timing concurrent execution: {@link chapter10.item69.ConcurrentTimer}.
 * For interval timing, always use System.nanoTime in preference to System.currentTime- Millis.
 * *
 * While you should always use the concurrency utilities in preference to wait and notify,
 * you might have to maintain legacy code that uses wait and notify.
 * // The standard idiom for using the wait method
 * synchronized (obj) {
 *  while (<condition does not hold>)
 *      obj.wait(); // (Releases lock, and reacquires on wakeup)
 *      ... // Perform action appropriate to condition
 *  }
 * Always use the wait loop idiom to invoke the wait method; never invoke it outside of a loop.
 * *
 * In summary, using wait and notify directly is like programming in “concurrency assembly language,”
 * as compared to the higher-level language provided by java.util.concurrent.
 * There is seldom, if ever, a reason to use wait and notify in new code.
 * If you maintain code that uses wait and notify, make sure that it always invokes wait from within a while loop using the standard idiom.
 * The notifyAll method should generally be used in preference to notify. If notify is used, great care must be taken to ensure liveness.
 */
package chapter10.item69;