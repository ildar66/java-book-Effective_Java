package chapter_2.item_2;

import java.io.ObjectStreamException;

// Singleton with final field
public class Elvis {

    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        //...
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
