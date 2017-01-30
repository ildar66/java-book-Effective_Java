// Broken! - How long would you expect this program to run? - Page 259
package chapter10.item66.brokenstopthread;

import java.util.concurrent.TimeUnit;

public class StopThread {

    // private volatile static boolean stopRequested;
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {

            public void run() {
             /* In the absence of synchronization, it’s quite acceptable for the virtual machine to transform this code:
                while (!done)
                    i++;
                into this code:
                if (!done)
                    while (true)
                        i++;
                This optimization is known as hoisting,
             */
                int i = 0;
                while (!stopRequested)
                    i++;
            }
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
