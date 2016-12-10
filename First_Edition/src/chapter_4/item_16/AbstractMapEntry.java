package chapter_4.item_16;

import java.util.Map;

/**
 * Writing a skeletal implementation is a relatively simple, if somewhat tedious, matter. First
 * you must study the interface and decide which methods are the primitives in terms of which
 * the others can be implemented. These primitives will be the abstract methods in your skeletal
 * implementation. Then you must provide concrete implementations of all the other methods in
 * the interface. For example, here's a skeletal implementation of the Map.Entry interface:
 */
// Skeletal Implementation
public abstract class AbstractMapEntry implements Map.Entry {

    // Primitives
    public abstract Object getKey();

    public abstract Object getValue();

    // Entries in modifiable maps must override this method
    public Object setValue(Object value) {
        throw new UnsupportedOperationException();
    }

    // Implements the general contract of Map.Entry.equals
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry arg = (Map.Entry) o;
        return eq(getKey(), arg.getKey()) &&
                eq(getValue(), arg.getValue());
    }

    private static boolean eq(Object o1, Object o2) {
        return (o1 == null ? o2 == null : o1.equals(o2));
    }

    // Implements the general contract of Map.Entry.hashcode
    public int hashCode() {
        return
                (getKey() == null ? 0 : getKey().hashCode()) ^
                        (getValue() == null ? 0 : getValue().hashCode());
    }
}
