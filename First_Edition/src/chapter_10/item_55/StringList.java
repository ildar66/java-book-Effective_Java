package chapter_10.item_55;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * // StringList with a reasonable custom serialized form
 * Note that the writeObject method invokes defaultWriteObject and the readObject method invokes defaultReadObject,
 * even though all of StringList's fields are transient.
 * If all instance fields are transient, it is technically permissible to dispense with invoking defaultWriteObject and defaultReadObject,
 * but it is not recommended.
 */
public class StringList implements Serializable {

    private transient int size = 0;
    private transient Entry head = null;

    // No longer Serializable!
    private static class Entry {

        String data;
        Entry next;
        Entry previous;
    }

    // Appends the specified string to the list
    public void add(String s) {
        //...
    }

    /**
     * Serialize this <tt>StringList</tt> instance.
     */

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(size);
        // Write out all elements in the proper order.
        for (Entry e = head; e != null; e = e.next)
            s.writeObject(e.data);
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int size = s.readInt();
        // Read in all elements and insert them in list
        for (int i = 0; i < size; i++)
            add((String) s.readObject());
    }

    // ... // Remainder omitted
}
