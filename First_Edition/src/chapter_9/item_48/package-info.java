/**
 * Item 48: Synchronize access to shared mutable data.
 * *
 * You may hear it said that to improve performance, you should avoid the use of synchronization when reading or writing atomic data.
 * This advice is dangerously wrong. Synchronization is required for reliable communication between threads as well as for mutual exclusion.
 * *
 * // The double-check idiom for lazy initialization - broken!
 * private static Foo foo = null;
 * public static Foo getFoo() {
 *  if (foo == null) {
 *      synchronized (Foo.class) {
 *          if (foo == null)
 *              foo = new Foo();
 *      }
 *  }
 *  return foo;
 * }
 * *
 * // Normal static initialization (not lazy)
    private static final Foo foo = new Foo();
    public static Foo getFoo() {
        return foo;
    }
 * *
 * // Properly synchronized lazy initialization
    private static Foo foo = null;
    public static synchronized Foo getFoo() {
        if (foo == null)
            foo = new Foo();
        return foo;
    }
 * *
 * // The initialize-on-demand holder class idiom
    private static class FooHolder {
        static final Foo foo = new Foo();
    }
    public static Foo getFoo() { return FooHolder.foo; }
 **
 * In summary, whenever multiple threads share mutable data, each thread that reads or writes the data must obtain a lock.
 */
package chapter_9.item_48;