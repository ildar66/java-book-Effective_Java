/**
 * Item 51: Don't depend on the thread scheduler.
 * *
 * Any program that relies on the thread scheduler for its correctness or performance is likely to be nonportable.
 * *
 * Resist the temptation to “fix” the program by putting in calls to Thread.yield.
 * *
 * Thread priorities are among the least portable features of the Java platform.
 * *
 * The only use that most programmers will ever have for Thread.yield is to artificially increase the concurrency of a program during testing.
 * *
 * In summary, do not depend on the thread scheduler for the correctness of your application.
 * The resulting application will be neither robust nor portable.
 * As a corollary, do not rely on Thread.yield or thread priorities.
 * These facilities are merely hints to the scheduler. They may be used sparingly to improve the quality of service of an already working
 * implementation, but they should never be used to “fix” a program that barely works.
 */
package chapter_9.item_51;