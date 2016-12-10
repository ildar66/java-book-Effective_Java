/**
 * Item 16: Prefer interfaces to abstract classes.
 *
 * Existing classes can be easily retrofitted to implement a new interface.
 *
 * Interfaces are ideal for defining mixins.
 *
 * Interfaces allow the construction of non-hierarchical type frameworks @see {@link chapter_4.item_16.SingerSongwriter}.
 *
 * Interfaces enable safe, powerful functionality enhancements via the wrapper class idiom, described in Item 14.
 *
 * You can combine the virtues of interfaces and abstract classes by providing an abstract skeletal implementation class
 * to go with each nontrivial interface that you export.
 *
 * To summarize, an interface is generally the best way to define a type that permits multiple implementations.
 * An exception to this rule is the case where ease of evolution is deemed more important than flexibility and power.
 * Under these circumstances, you should use an abstract class to define the type, but only if you understand and can accept the limitations.
 * If you export a nontrivial interface, you should strongly consider providing a skeletal implementation to go with it.
 * Finally, you should design all of your public interfaces with the utmost care
 * and test them thoroughly by writing multiple implementations.
 */
/*
// List adapter for int array
    static List intArrayAsList(final int[] a) {
        if (a == null)
            throw new NullPointerException();
        return new AbstractList() {
            public Object get(int i) {
                return new Integer(a[i]);
            }
            public int size() {
                return a.length;
            }
            public Object set(int i, Object o) {
                int oldVal = a[i];
                a[i] = ((Integer)o).intValue();
                return new Integer(oldVal);
            }
        };
    }
 */
package chapter_4.item_16;