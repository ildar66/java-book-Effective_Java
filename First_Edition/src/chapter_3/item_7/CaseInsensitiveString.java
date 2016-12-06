package chapter_3.item_7;

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
/*
    //Broken - violates symmetry!
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString)
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        if (o instanceof String) // One-way interoperability!
            return s.equalsIgnoreCase((String) o);
        return false;
    }*/

    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }

    // ... // Remainder omitted
}
