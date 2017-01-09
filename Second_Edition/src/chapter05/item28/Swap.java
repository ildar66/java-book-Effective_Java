// Private helper method for wildcard capture - Pages 139-140
package chapter05.item28;

import java.util.Arrays;
import java.util.List;

public class Swap {

    //The problem is that the type of list is List<?>, and you can’t put any value except null into a List<?>.
    /* public static void swap(List<?> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }*/

    public static void swap(List<?> list, int i, int j) {
        swapHelper(list, i, j);
    }

    // Private helper method for wildcard capture
    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        // Swap the first and last argument and print the resulting list
        // List<String> argList = Arrays.asList(args);
        List<String> argList = Arrays.asList("two", "one", "three");
        swap(argList, 0, argList.size() - 1);
        System.out.println(argList);

        List<Integer> intList = Arrays.asList(0, 1, 2);
        swap(intList, 0, intList.size() - 1);
        System.out.println(intList);
    }
}
