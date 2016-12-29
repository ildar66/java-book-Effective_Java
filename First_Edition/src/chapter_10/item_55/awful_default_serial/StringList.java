package chapter_10.item_55.awful_default_serial;

import java.io.Serializable;

/**
 * Logically speaking, this class represents a sequence of strings. Physically, it represents the sequence as a doubly linked list.
 * If you accept the default serialized form, the serialized form will painstakingly mirror every entry in the linked list
 * and all the links between the entries, in both directions.
 * @see chapter_10.item_55.StringList with a reasonable custom serialized form.
 */

//Awful candidate for default serialized form
public class StringList implements Serializable {

    private int size = 0;
    private Entry head = null;

    private static class Entry implements Serializable {

        String data;
        Entry next;
        Entry previous;
    }
    // ... // Remainder omitted

}
