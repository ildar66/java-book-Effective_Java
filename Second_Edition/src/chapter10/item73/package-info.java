/**
 * Item 73: Avoid thread groups.
 * *
 * Thread groups are obsolete.
 * *
 * Prior to release 1.5, there was one small piece of functionality that was available only with the ThreadGroup API:
 * the ThreadGroup.uncaughtException method was the only way to gain control when a thread threw an uncaught exception.
 * This functionality is useful, for example, to direct stack traces to an application- specific log.
 * As of release 1.5, however, the same functionality is available with Thread’s setUncaughtExceptionHandler method.
 * *
 * To summarize,
 * thread groups don’t provide much in the way of useful functionality, and much of the functionality they do provide is flawed.
 * Thread groups are best viewed as an unsuccessful experiment, and you should simply ignore their existence.
 * If you design a class that deals with logical groups of threads, you should probably use thread pool executors (Item 68).
 */
package chapter10.item73;