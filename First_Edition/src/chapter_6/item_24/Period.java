package chapter_6.item_24;

import java.util.Date;

// Broken "immutable" time period class
public final class Period {

    private final Date start;
    private final Date end;

    /**
     * @param start the beginning of the period.
     * @param end the end of the period; must not precede start.
     * @throws IllegalArgumentException if start is after end.
     * @throws NullPointerException if start or end is null.
     */
    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + " after " + end);
        this.start = start;
        this.end = end;
    }

    // ... // Remainder omitted

    // Attack the internals of a Period instance
    //    Date start = new Date();
    //    Date end = new Date();
    //    Period p = new Period(start, end);
    //    end.setYear(78); // Modifies internals of p!

/*    // Repaired constructor - makes defensive copies of parameters
    public Period(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start +" after "+ end);
    }*/

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }

    // Second attack on the internals of a Period instance
    //    Date start = new Date();
    //    Date end = new Date();
    //    Period p = new Period(start, end);
    //    p.end().setYear(78); // Modifies internals of p!

/*    To defend against the second attack, merely modify the accessors to return defensive copies of mutable internal fields:
    // Repaired accessors - make defensive copies of internal fields
    public Date start() {
        return (Date) start.clone();
    }
    public Date end() {
        return (Date) end.clone();
    }*/
}
