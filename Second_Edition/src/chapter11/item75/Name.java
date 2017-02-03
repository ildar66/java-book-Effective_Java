package chapter11.item75;

import java.io.Serializable;

// Good candidate for default serialized form
public class Name implements Serializable {

    /**
     * Last name. Must be non-null.
     */
    private /*final*/ String lastName;
    /**
     * First name. Must be non-null.
     */
    private /*final*/ String firstName;
    /**
     * Middle name, or null if there is none.
     */
    private /*final*/ String middleName;

    // ... // Remainder omitted
}
