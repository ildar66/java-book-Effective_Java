package chapter_3.item_10;

import java.util.EmptyStackException;

/**
 * If, however, your object contains fields that refer to mutable objects, using this clone implementation can be disastrous.
 * In effect, the clone method functions as another constructor; you must ensure that it
 * does no harm to the original object and that it properly establishes invariants on the clone.
 * Note that this solution would not work if the buckets field were final because the clone
 * method would be prohibited from assigning a new value to the field. This is a fundamental
 * problem: the clone architecture is incompatible with normal use of final fields referring
 * to mutable objects, except in cases where the mutable objects may be safely shared between
 * an object and its clone. In order to make a class cloneable, it may be necessary to remove
 * final modifiers from some fields.
 */
public class Stack implements Cloneable {

    //private final Object[] elements;
    private Object[] elements;
    private int size = 0;

    public Stack(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public Object clone() throws CloneNotSupportedException {
        Stack result = (Stack) super.clone();
        result.elements = (Object[]) elements.clone();
        return result;
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    // Ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size) {
            Object oldElements[] = elements;
            elements = new Object[2 * elements.length + 1];
            System.arraycopy(oldElements, 0, elements, 0, size);
        }
    }
}
