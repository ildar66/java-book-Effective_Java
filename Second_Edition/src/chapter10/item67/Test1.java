// Simple test of ObservableSet - Page 266
package chapter10.item67;

import java.util.HashSet;

public class Test1 {

    /**
     * On cursory inspection, ObservableSet appears to work. For example, the following
     * program prints the numbers from 0 through 99:
     */
    public static void main(String[] args) {
        ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

        set.addObserver(new SetObserver<Integer>() {

            public void added(ObservableSet<Integer> s, Integer e) {
                System.out.println(e);
            }
        });

        for (int i = 0; i < 100; i++)
            set.add(i);
    }
}
