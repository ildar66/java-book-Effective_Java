package chapter_9.item_51;

import java.util.LinkedList;
import java.util.List;

// HORRIBLE PROGRAM - uses busy-wait instead of Object.wait!
public abstract class WorkQueue {

    private final List queue = new LinkedList<>();
    private boolean stopped = false;

    protected WorkQueue() {
        new WorkerThread().start();
    }

    public final void enqueue(Object workItem) {
        synchronized (queue) {
            queue.add(workItem);
        }
    }

    public final void stop() {
        synchronized (queue) {
            stopped = true;
        }
    }

    protected abstract void processItem(Object workItem)
            throws InterruptedException;

    private class WorkerThread extends Thread {

        public void run() {
            final Object QUEUE_IS_EMPTY = new Object();
            while (true) { // Main loop
                Object workItem = QUEUE_IS_EMPTY;
                synchronized (queue) {
                    if (stopped)
                        return;
                    if (!queue.isEmpty())
                        workItem = queue.remove(0);
                }
                if (workItem != QUEUE_IS_EMPTY) {
                    try {
                        processItem(workItem);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            }
        }
    }
}
