// More complex test of ObservableSet - Page 267
package chapter10.item67;

import java.util.HashSet;

public class Test2 {

    /**
     * You might expect the program to print the numbers 0 through 23, after which the
     * observer would unsubscribe and the program complete its work silently. What actually happens is that
     * it prints the numbers 0 through 23, and then throws a ConcurrentModificationException.
     */
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {

            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
                if (e == 23)
                    s.removeObserver(this);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
