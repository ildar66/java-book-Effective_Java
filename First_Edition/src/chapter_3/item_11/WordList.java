package chapter_3.item_11;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * It is similarly easy to search, compute extreme values, and maintain automatically sorted
 * collections of Comparable objects. For example, the following program, which relies on the
 * fact that String implements Comparable, prints an alphabetized list of its command-line
 * arguments with duplicates eliminated:
 */
public class WordList {

    public static void main(String[] args) {
        Set s = new TreeSet();
        s.addAll(Arrays.asList(args));
        System.out.println(s);
    }
}
