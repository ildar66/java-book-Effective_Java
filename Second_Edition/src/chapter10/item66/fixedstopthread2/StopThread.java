// Cooperative thread termination with a volatile field
package chapter10.item66.fixedstopthread2;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {

            public void run() {
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

    /* You do have to be careful when using volatile.
       Consider the following method,which is supposed to generate serial numbers:
       (The problem is that the increment operator (++) is not atomic.)
    // Broken - requires synchronization!
        private static volatile int nextSerialNumber=0;
        public static int generateSerialNumber(){
            return nextSerialNumber++;
    }*/

    /* Better still, follow the advice in Item 47 and use the class AtomicLong, which is part of java.util.concurrent.atomic.
    private static final AtomicLong nextSerialNum = new AtomicLong();
    public static long generateSerialNumber() {
        return nextSerialNum.getAndIncrement();
    }*/
