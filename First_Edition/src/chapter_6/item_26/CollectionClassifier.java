package chapter_6.item_26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * //Broken - incorrect use of overloading!
 * You might expect this program to print “Set,” followed by “List” and “Unknown
 * Collection,” but it doesn't; it prints out “Unknown Collection” three times. Why does this
 * happen? Because the classify method is overloaded, and the choice of which overloading
 * to invoke is made at compile time. For all three iterations of the loop, the compile-time type
 * of the parameter is the same: Collection.
 */

public class CollectionClassifier {

    public static String classify(Set s) {
        return "Set";
    }

    public static String classify(List l) {
        return "List";
    }

    public static String classify(Collection c) {
        return "Unknown Collection";
    }
    /*
    The way to fix the program is to replace all three overloadings of classify with a single method that does an explicit
    instanceof test:
    //    public static String classify(Collection c) {
    //        return (c instanceof Set ? "Set" :
    //                (c instanceof List ? "List" : "Unknown Collection"));
    //    }*/

    public static void main(String[] args) {
        Collection[] tests = new Collection[] {
                new HashSet(), // A Set
                new ArrayList(), // A List
                new HashMap().values() // Neither Set nor List
        };
        for (int i = 0; i < tests.length; i++)
            System.out.println(classify(tests[i]));
    }
}
