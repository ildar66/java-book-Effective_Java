package chapter_9.item_49;

/**
 * Because the WorkQueue class invokes the abstract processItem method from within a
 * synchronized block, it is subject to deadlock.
 */
class DeadlockQueue extends WorkQueue {

    protected void processItem(final Object workItem)
            throws InterruptedException {
        // Create a new thread that returns workItem to queue
        Thread child = new Thread() {

            public void run() {
                enqueue(workItem);
            }
        };
        child.start();
        child.join(); // Deadlock!
    }
}
