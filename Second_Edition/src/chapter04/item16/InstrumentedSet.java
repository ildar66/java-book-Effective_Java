// Wrapper class - uses composition in place of inheritance - Page 84
package chapter04.item16;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * The InstrumentedSet class is known as a wrapper class because each InstrumentedSet instance contains (“wraps”) another Set instance.
 * This is also known as the Decorator pattern [Gamma95, p. 175], because the Instrumented-Set class “decorates” a set by adding instrumentation.
 * @param <E>
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {

    private int addCount = 0;

    public InstrumentedSet(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

    public static void main(String[] args) {
        InstrumentedSet<String> s = new InstrumentedSet<String>(new HashSet<String>());
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
        System.out.println(s.getAddCount());
    }
}
