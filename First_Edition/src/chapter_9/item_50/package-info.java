/**
 * Item 50: Never invoke wait outside a loop.
 * *
 * This is the standard idiom for using the wait method:
 *  synchronized (obj) {
 *      while (<condition does not hold>)
 *          obj.wait();
 *      ... // Perform action appropriate to condition
 *  }
 * Always use the wait loop idiom to invoke the wait method.
 * *
 * In summary, always invoke wait from within a while loop, using the standard idiom. There
 * is simply no reason to do otherwise. Usually, you should use notifyAll in preference to
 * notify. There are, however, situations where doing so will impose a substantial performance
 * penalty. If notify is used, great care must be taken to ensure liveness.
 */
package chapter_9.item_50;