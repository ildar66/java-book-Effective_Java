package chapter08.item50;

/**
 * The Java libraries have had a thread-local variable facility since release 1.2,
 * but prior to that, programmers had to roll their own.
 */
public class ThreadLocalHistory {
   /*
    // The problem with this approach is that the string keys represent a shared global namespace for thread-local variables.
    // Broken - inappropriate use of string as capability!
    public class ThreadLocal {
        private ThreadLocal() { } // Noninstantiable
        // Sets the current thread's value for the named variable.
        public static void set(String key, Object value);
        // Returns the current thread's value for the named variable.
        public static Object get(String key);
    }*/

    /*// This API can be fixed by replacing the string with an unforgeable key (sometimes called a capability):
    public class ThreadLocal {
        private ThreadLocal() { } // Noninstantiable
        public static class Key { // (Capability)
            Key() { }
        }
        // Generates a unique, unforgeable key
        public static Key getKey() {
            return new Key();
        }
        public static void set(Key key, Object value);
        public static Object get(Key key);
    }*/

    /*
    // You don’t really need the static methods anymore. They can instead become instance methods on the key,
    // at which point the key is no longer a key for a thread-local variable: it is a thread-local variable.
    public final class ThreadLocal {
        public ThreadLocal() { }
        public void set(Object value);
        public Object get();
    }*/

   /*
   // generifying:
    public final class ThreadLocal<T> {
        public ThreadLocal() { }
        public void set(T value);
        public T get();
    }*/

}
