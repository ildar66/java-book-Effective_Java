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