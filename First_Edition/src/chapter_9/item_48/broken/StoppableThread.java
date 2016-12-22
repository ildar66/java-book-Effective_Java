package chapter_9.item_48.broken;

// Broken - requires synchronization!
public class StoppableThread extends Thread {

    private boolean stopRequested = false;

    public void run() {
        boolean done = false;
        while (!stopRequested && !done) {
            // ... // do what needs to be done.
        }
    }

    public void requestStop() {
        stopRequested = true;
    }
}
