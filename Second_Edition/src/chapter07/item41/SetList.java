// What does this program print? - Page 194
package chapter07.item41;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetList {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<Integer>();
        List<Integer> list = new ArrayList<Integer>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }

        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(i);
            /*
                The confusing behavior demonstrated because the List<E> interface has two overloadings of the remove method:
                remove(E) and remove(int).
            */
            // list.remove((Integer) i); // or remove(Integer.valueOf(i))
        }

        System.out.println(set + " " + list);
    }
}
