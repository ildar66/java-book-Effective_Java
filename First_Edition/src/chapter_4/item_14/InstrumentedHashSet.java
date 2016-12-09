package chapter_4.item_14;

import java.util.Collection;
import java.util.HashSet;

/**
 * Broken - Inappropriate use of inheritance!
 * InstrumentedHashSet s = new InstrumentedHashSet();
 * s.addAll(Arrays.asList(new String[] {"Snap","Crackle","Pop"}));
 * The addAll method in InstrumentedHashSet added three to addCount and then invoked
 * HashSet's addAll implementation using super.addAll.
 */
public class InstrumentedHashSet extends HashSet {

    // The number of attempted element insertions
    private int addCount = 0;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(Collection c) {
        super(c);
    }

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    public boolean add(Object o) {
        addCount++;
        return super.add(o);
    }

    public boolean addAll(Collection c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}
