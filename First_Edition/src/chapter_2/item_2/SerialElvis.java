package chapter_2.item_2;

import java.io.ObjectStreamException;
import java.io.Serializable;

// Singleton with final field and with implementation Serializable
public class SerialElvis implements Serializable {

    public static final SerialElvis INSTANCE = new SerialElvis();

    private SerialElvis() {
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
