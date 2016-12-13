package chapter_5.item_21;

import java.io.ObjectStreamException;

// Subclass of extensible, serializable typesafe enum
abstract class ExtendedOperation extends Operation2 {

    ExtendedOperation(String name) {
        super(name);
    }

    public static Operation2 LOG = new ExtendedOperation("log") {

        protected double eval(double x, double y) {
            return Math.log(y) / Math.log(x);
        }
    };
    public static Operation2 EXP = new ExtendedOperation("exp") {

        protected double eval(double x, double y) {
            return Math.pow(x, y);
        }
    };
    // The 4 declarations below are necessary for serialization
    private static int nextOrdinal = 0;
    private final int ordinal = nextOrdinal++;
    private static final Operation2[] VALUES = {LOG, EXP};

    Object readResolve() throws ObjectStreamException {
        return VALUES[ordinal]; // Canonicalize
    }
}
