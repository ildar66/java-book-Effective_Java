package chapter_10.item_56;

import java.io.Serializable;
import java.util.Date;

//Immutable class that uses defensive copying
public final class Period implements Serializable {

    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period.
     * @param end the end of the period; must not precede start.
     * @throws IllegalArgumentException if start is after end.
     * @throws NullPointerException if start or end is null.
     */
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start + " > " + end);
    }

    public Date start() {
        return (Date) start.clone();
    }

    public Date end() {
        return (Date) end.clone();
    }

    public String toString() {
        return start + " - " + end;
    }
    // ... // Remainder omitted
/*
    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        // Check that our invariants are satisfied
        if (start.compareTo(end) > 0)
            throw new InvalidObjectException(start + " after " + end);
    }
*/
}
