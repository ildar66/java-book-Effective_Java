package chapter_4.item_18;

import java.util.AbstractSet;
import java.util.Iterator;

// Typical use of a nonstatic member class
public class MySet extends AbstractSet {

    // ... // Bulk of the class omitted
    public Iterator iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    private class MyIterator implements Iterator {

        @Override
        public boolean hasNext() {
            //...
            return false;
        }

        @Override
        public Object next() {
            //...
            return null;
        }
        //...
    }
}
