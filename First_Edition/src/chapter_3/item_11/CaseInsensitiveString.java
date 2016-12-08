package chapter_3.item_11;

/**
 * Case-insensitive string.
 * Case of the original string is preserved by toString, but ignored in comparisons.
 */
public final class CaseInsensitiveString {

    private String s;

    public CaseInsensitiveString(String s) {
        if (s == null)
            throw new NullPointerException();
        this.s = s;
    }

    /**
     * If a field does not implement Comparable or you need to use a nonstandard ordering,
     * you can use an explicit Comparator instead.
     */
    public int compareTo(Object o) {
        CaseInsensitiveString cis = (CaseInsensitiveString) o;
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }

    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    // ... // Remainder omitted
}
