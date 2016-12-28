package chapter_10.item_55;

import java.io.Serializable;

/**
 * //Good candidate for default serialized form.
 * 
 * Note that there are documentation comments on the lastName, firstName, and middleInitial fields,
 * even though they are private.
 */

public class Name implements Serializable {

    /**
     * Last name. Must be non-null.
     */
    private String lastName;
    /**
     * First name. Must be non-null.
     */
    private String firstName;
    /**
     * Middle initial, or '\u0000' if name lacks middle initial.
     */
    private char middleInitial;

    // ... // Remainder omitted
}
