// Reflective instantiation with interface access - Page 231
package chapter08.item53;

import java.util.Arrays;
import java.util.Set;

/**
 * Program that creates a Set<String> instance whose class is specified by the first command line argument.
 * If you specify java.util.HashSet, they’re printed in apparently random order;
 * if you specify java.util.TreeSet, they’re printed in alphabetical order, as the elements in a TreeSet are sorted:
 */
public class MakeSet {

    public static void main(String[] args) {
        if (args.length == 0) {
            //args = new String[] {"java.util.HashSet", "a", "0", "c", "2"};
            args = new String[] {"java.util.TreeSet", "a", "0", "c", "2"};
        }

        // Translate the class name into a Class object
        Class<?> cl = null;
        try {
            cl = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.err.println("Class not found.");
            System.exit(1);
        }

        // Instantiate the class
        Set<String> s = null;
        try {
            s = (Set<String>) cl.newInstance();
        } catch (IllegalAccessException e) {
            System.err.println("Class not accessible.");
            System.exit(1);
        } catch (InstantiationException e) {
            System.err.println("Class not instantiable.");
            System.exit(1);
        }

        // Exercise the set
        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);
    }
}
