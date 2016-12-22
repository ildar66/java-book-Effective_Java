/**
 * Item 6: Eliminate obsolete object references.
 * *
 * see {@link chapter02.item06.Stack} So where is the memory leak?
 * If a stack grows and then shrinks, the objects that were popped off the stack will not be garbage collected, even if the program
 * using the stack has no more references to them. This is because the stack maintains
 * obsolete references to these objects.
 * *
 * The corrected version of the pop method looks like this:
 * public Object pop() {
 *    if (size == 0)
 *      throw new EmptyStackException();
 *    Object result = elements[--size];
 *    elements[size] = null; // Eliminate obsolete reference
 *    return result;
 * }
 * *
 * Nulling out object references should be the exception rather than the norm.
 * The best way to eliminate an obsolete reference is to let the variable that contained the reference fall out of scope.
 * *
 * Generally speaking, whenever a class manages its own memory, the programmer should be alert for memory leaks.
 * *
 * Another common source of memory leaks is caches.
 * *
 * A third common source of memory leaks is listeners and other callbacks.
 */
package chapter02.item06;