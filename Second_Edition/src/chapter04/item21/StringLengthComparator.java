package chapter04.item21;

/**
 * This class exports a single method that takes two strings and returns a negative integer if the first string is shorter than the second,
 * zero if the two strings are of equal length, and a positive integer if the first string is longer.
 */
class StringLengthComparator {

    private StringLengthComparator() {
    }

    public static final StringLengthComparator INSTANCE = new StringLengthComparator();

    /**
     * This method is a comparator that orders strings based on their length instead of the more typical lexicographic ordering.
     * @param s1
     * @param s2
     * @return
     */
    public int compare(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
