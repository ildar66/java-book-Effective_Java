package chapter_5.item_22;

import java.io.Serializable;
import java.util.Comparator;

/**
 * The String class uses this pattern to export a case-independent string comparator via its CASE_INSENSITIVE_ORDER field.
 */
// Exporting a concrete strategy
class Host {

    // ... // Bulk of class omitted
    
    private static class StrLenCmp implements Comparator, Serializable {

        public int compare(Object o1, Object o2) {
            String s1 = (String) o1;
            String s2 = (String) o2;
            return s1.length() - s2.length();
        }
    }

    // Returned comparator is serializable
    public static final Comparator STRING_LENGTH_COMPARATOR = new StrLenCmp();
}
