/**
 * Item 68: Prefer executors and tasks to threads.
 * *
 * // Creating a work queue that is better in every way than the one in the first edition of this book requires but a single line of code:
 * ExecutorService executor = Executors.newSingleThreadExecutor();
 * // Here is how to submit a runnable for execution:
 * executor.execute(runnable);
 * // And here is how to tell the executor to terminate gracefully (if you fail to do this, it is likely that your VM will not exit):
 * executor.shutdown();
 * *
 * A complete treatment of the Executor Framework: "Java Concurrency in Practice"(Goetz, Brian, ...).
 */
package chapter10.item68;