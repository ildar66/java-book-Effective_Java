package chapter_3.item_10;

/**
 * It is not always sufficient to call clone recursively. For example, suppose you are writing a
 * clone method for a hash table whose internals consist of an array of buckets, each of which
 * references the first entry in a linked list of key-value pairs or is null if the bucket is empty.
 * For performance, the class implements its own lightweight singly linked list instead of using
 * java.util.LinkedList internally:
 */
public class HashTable implements Cloneable {

    private Entry[] buckets; // =  ...;

    private static class Entry {

        Object key;
        Object value;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // Broken - results in shared internal state!
    public Object clone() throws CloneNotSupportedException {
        HashTable result = (HashTable) super.clone();
        result.buckets = (Entry[]) buckets.clone();
        return result;
    }

    // ... // Remainder omitted
}
