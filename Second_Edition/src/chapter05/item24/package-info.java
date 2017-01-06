/**
 * Item 24: Eliminate unchecked warnings.
 * *
 * Eliminate every unchecked warning that you can.
 * *
 * If you can’t eliminate a warning, and you can prove that the code that provoked the warning is typesafe,
 * then (and only then) suppress the warning with an @SuppressWarnings("unchecked") annotation.
 * *
 * Always use the Suppress- Warnings annotation on the smallest scope possible. {@link java.util.ArrayList}:
 * // Adding local variable to reduce scope of @SuppressWarnings
     public <T> T[] toArray(T[] a) {
         if (a.length < size) {
            // This cast is correct because the array we're creating is of the same type as the one passed in, which is T[].
            @SuppressWarnings("unchecked") T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
         }
         System.arraycopy(elements, 0, a, 0, size);
         if (a.length > size)
            a[size] = null;
         return a;
     }
 * *
 * Every time you use an @SuppressWarnings("unchecked") annotation, add a comment saying why it’s safe to do so.
 * *
 * In summary, unchecked warnings are important. Don’t ignore them.
 * Every unchecked warning represents the potential for a ClassCastException at runtime. Do your best to eliminate these warnings.
 * If you can’t eliminate an unchecked warning and you can prove that the code that provoked it is typesafe, suppress the warning
 * with an @SuppressWarnings("unchecked") annotation in the narrowest possible scope. Record the rationale for your decision to
 * suppress the warning in a comment.
 */
package chapter05.item24;