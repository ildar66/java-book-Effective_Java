package chapter_3.item_11;

public final class PhoneNumber {

    private final short areaCode;
    private final short exchange;
    private final short extension;

    public PhoneNumber(int areaCode, int exchange,
                       int extension) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(exchange, 999, "exchange");
        rangeCheck(extension, 9999, "extension");
        this.areaCode = (short) areaCode;
        this.exchange = (short) exchange;
        this.extension = (short) extension;
    }

    private static void rangeCheck(int arg, int max,
                                   String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber) o;
        return pn.extension == extension &&
                pn.exchange == exchange &&
                pn.areaCode == areaCode;
    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + areaCode;
        result = 37 * result + exchange;
        result = 37 * result + extension;
        return result;
    }

    /**
     * Compare primitive fields using the relational operators < and >, and arrays by applying these
     * guidelines to each element. If a class has multiple significant fields, the order in which you
     * compare them is critical. You must start with the most significant field and work your way
     * down. If a comparison results in anything other than zero (which represents equality), you're
     * done; just return the result. If the most significant fields are equal, go on to compare the nextmost-
     * significant fields, and so on. If all fields are equal, the objects are equal; return zero.
     */
    public int compareTo(Object o) {
        PhoneNumber pn = (PhoneNumber) o;
        // Compare area codes
        if (areaCode < pn.areaCode)
            return -1;
        if (areaCode > pn.areaCode)
            return 1;
        // Area codes are equal, compare exchanges
        if (exchange < pn.exchange)
            return -1;
        if (exchange > pn.exchange)
            return 1;
        // Area codes and exchanges are equal, compare extensions
        if (extension < pn.extension)
            return -1;
        if (extension > pn.extension)
            return 1;
        return 0; // All fields are equal
    }

/*
*   This trick works fine here but should be used with extreme caution. Don't do it unless you're
*       certain that the field in question cannot be negative or, more generally, that the difference
*       between the lowest and highest possible field values is less than or equal to INTEGER.MAX_VALUE (231-1).
   public int compareTo(Object o) {
        PhoneNumber pn = (PhoneNumber)o;
        // Compare area codes
        int areaCodeDiff = areaCode - pn.areaCode;
        if (areaCodeDiff != 0)
            return areaCodeDiff;
        // Area codes are equal, compare exchanges
        int exchangeDiff = exchange - pn.exchange;
        if (exchangeDiff != 0)
            return exchangeDiff;
        // Area codes and exchanges are equal, compare extensions
        return extension - pn.extension;
    }*/
    // ... // Remainder omitted
}
