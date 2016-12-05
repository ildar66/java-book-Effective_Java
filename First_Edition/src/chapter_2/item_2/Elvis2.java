package chapter_2.item_2;

import java.io.ObjectStreamException;

// Singleton with static factory
public class Elvis2 {

    private static final Elvis2 INSTANCE = new Elvis2();

    private Elvis2() {
        //...
    }

    public static Elvis2 getInstance() {
        return INSTANCE;
    }
    //... // Remainder omitted

    // readResolve method to preserve singleton property
    private Object readResolve() throws ObjectStreamException {
        /**
         * Return the one true Elvis and let the garbage collector
         * take care of the Elvis impersonator.
         */
        return INSTANCE;
    }
}
