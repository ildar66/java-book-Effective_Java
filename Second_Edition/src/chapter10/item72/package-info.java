/**
 * Item 72: Don’t depend on the thread scheduler.
 * *
 * Any program that relies on the thread scheduler for correctness or performance is likely to be nonportable.
 * *
 * Threads should not run if they aren’t doing useful work: {@link chapter10.item72.SlowCountDownLatch}.
 * *
 * Resist the temptation to “fix” the program by putting in calls to Thread.yield.
 * Thread.yield has no testable semantics.
 * *
 * Thread priorities are among the least portable features of the Java platform.
 * *
 * Use Thread.sleep(1) instead of Thread.yield.
 * *
 * In summary, do not depend on the thread scheduler for the correctness of your program.
 * The resulting program will be neither robust nor portable.
 * As a corollary, do not rely on Thread.yield or thread priorities.
 * These facilities are merely hints to the scheduler.
 * Thread priorities may be used sparingly to improve the quality of service of an already working program,
 * but they should never be used to “fix” a program that barely works.
 */
package chapter10.item72;