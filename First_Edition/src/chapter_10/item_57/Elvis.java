package chapter_10.item_57;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Item 2 describes the Singleton pattern and gives the following example of a singleton class.
 * This class restricts access to its constructor to ensure that only a single instance is ever created.
 * This class would no longer be a singleton if the words “implements Serializable” were added to its declaration.
 */
public class Elvis implements Serializable {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        // ...
    }

    // ... // Remainder omitted

    // If the Elvis class is made to implement Serializable, the following readResolve method suffices to guarantee the singleton property
    private Object readResolve() throws ObjectStreamException {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }

 /*   // The defensive readResolve idiom
    private Object readResolve() throws ObjectStreamException {
        return new Period(start, end);
    }*/

}
