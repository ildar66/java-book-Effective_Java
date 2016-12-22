package chapter_9.item_48.synch;

// Properly synchronized cooperative thread termination
public class StoppableThread extends Thread {

    private boolean stopRequested = false;

    public void run() {
        boolean done = false;
        while (!stopRequested() && !done) {
            // ... // do what needs to be done.
        }
    }

    public synchronized void requestStop() {
        stopRequested = true;
    }

    private synchronized boolean stopRequested() {
        return stopRequested;
    }
}