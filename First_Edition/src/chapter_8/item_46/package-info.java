/**
 * Item 46:Strive for failure atomicity.
 * *
 * Generally speaking, a failed method invocation should leave the object in the state that it was in prior to the invocation.
 * A method with this property is said to be failure atomic.
 * *
 * This causes any exception to get thrown before object modification commences. For example, consider the Stack.pop method in Item 5:
 * public Object pop() {
 *   if (size == 0)
 *      throw new EmptyStackException();
 *   Object result = elements[--size];
 *   elements[size] = null; // Eliminate obsolete reference
 *   return result;
 * }
 */
package chapter_8.item_46;