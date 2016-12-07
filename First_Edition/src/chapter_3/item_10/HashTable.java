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

        // Recursively copy the linked list headed by this Entry
        /*
         * Iteratively copy the linked list headed by this Entry
         * The deep-copy method on Entry invokes itself recursively to copy the entire linked list headed by the entry.
         * While this technique is cute and works fine if the buckets aren't too long, it is not a good way
         * to clone a linked list because it consumes one stack frame for each element in the list.

        Entry deepCopy() {
            return new Entry(key, value, next == null ? null : next.deepCopy());
        }
        */

        // Iteratively copy the linked list headed by this Entry
        Entry deepCopy() {
            Entry result = new Entry(key, value, next);
            for (Entry p = result; p.next != null; p = p.next)
                p.next = new Entry(p.next.key, p.next.value, p.next.next);
            return result;
        }

    }

    /*
     * @return
     * @throws CloneNotSupportedException
    */
    public Object clone() throws CloneNotSupportedException {
        HashTable result = (HashTable) super.clone();
        result.buckets = new Entry[buckets.length];
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i] != null) {
                result.buckets[i] = (Entry) buckets[i].deepCopy();
            }
        }
        return result;
    }

/*
   // Broken - results in shared internal state!
    public Object clone() throws CloneNotSupportedException {
        HashTable result = (HashTable) super.clone();
        result.buckets = (Entry[]) buckets.clone();
        return result;
    }*/

    // ... // Remainder omitted
}
