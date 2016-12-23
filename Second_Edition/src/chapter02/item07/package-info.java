/**
 * Item 7: Avoid finalizers.
 * *
 * Finalizers are unpredictable, often dangerous, and generally unnecessary:
 * never do anything time-critical in a finalizer;
 * never depend on a finalizer to update critical persistent state;
 * *
 * Just provide an explicit termination method.
 * Explicit termination methods are typically used in combination with the try-finally construct to ensure termination.
 * // try-finally block guarantees execution of termination method
 * Foo foo = new Foo(...);
 * try {
 * // Do what must be done with foo
 * ...
 * } finally {
 * foo.terminate(); // Explicit termination method
 * }
 * *
 * But the finalizer should log a warning if it finds that the resource has not been terminated.
 * *
 * Second legitimate use of finalizers concerns objects with native peers.
 * *
 * If a class (other than Object) has a finalizer and a subclass overrides it, the subclass finalizer must invoke the superclass finalizer manually.
 * *
 * If a subclass implementor overrides a superclass finalizer but forgets to invoke it, the superclass finalizer will never be invoked.
 * Finalizer Guardian idiom see {@link chapter02.item07.Foo}
 * *
 * In summary, don’t use finalizers except as a safety net or to terminate noncritical native resources.
 * In those rare instances where you do use a finalizer, remember to invoke super.finalize.
 * If you use a finalizer as a safety net, remember to log the invalid usage from the finalizer.
 * Lastly, if you need to associate a finalizer with a public, nonfinal class, consider using a finalizer guardian,
 * so finalization can take place even if a subclass finalizer fails to invoke super.finalize.
 */
package chapter02.item07;