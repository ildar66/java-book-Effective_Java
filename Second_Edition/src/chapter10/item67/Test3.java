// Perverse test of ObservableSet - bottom of Page 267
package chapter10.item67;

import java.util.HashSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test3 {

    /**
     * This time we don’t get an exception; we get a deadlock.
     * The background thread calls s.removeObserver, which attempts to lock observers,
     * but it can’t acquire the lock, because the main thread already has the lock.
     * All the while, the main thread is waiting for the background thread to finish removing the observer, which explains the deadlock.
     */
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

        // Observer that uses a background thread needlessly
        set.addObserver(new SetObserver<Integer>() {

            public void added(final ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23) {
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    final SetObserver<Integer> observer = this;
                    try {
                        executor.submit(new Runnable() {

                            public void run() {
                                s.removeObserver(observer);
                            }
                        }).get();
                    } catch (ExecutionException ex) {
                        throw new AssertionError(ex.getCause());
                    } catch (InterruptedException ex) {
                        throw new AssertionError(ex.getCause());
                    } finally {
                        executor.shutdown();
                    }
                }
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
