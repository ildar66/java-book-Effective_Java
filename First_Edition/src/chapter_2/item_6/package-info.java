/**
 * Created by User on 05.12.2016.
 * Item 6: Avoid finalizers
 *
 * nothing time-critical should ever be done by a finalizer.
 *
 * you should never depend on a finalizer to update critical persistent state.
 *
 * provide an explicit termination method.
 *
 * Explicit termination methods are often used in combination with the try-finally construct to ensure prompt termination.
     // try-finally block guarantees execution of termination method
     Foo foo = new Foo(...);
     try {
        // Do what must be done with foo
        ...
     } finally {
        foo.terminate(); // Explicit termination method
     }
 *
 *
 *   // Manual finalizer chaining
     protected void finalize() throws Throwable {
         try {
            // Finalize subclass state
                ...
         } finally {
            super.finalize();
         }
     }
 */
package chapter_2.item_6;