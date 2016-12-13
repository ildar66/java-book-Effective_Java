package chapter_5.item_21;

import java.io.ObjectStreamException;
import java.io.Serializable;

// Serializable, extensible typesafe enum
public abstract class Operation2 implements Serializable {

    private final transient String name;

    protected Operation2(String name) {
        this.name = name;
    }

    public static Operation PLUS = new Operation("+") {

        protected double eval(double x, double y) {
            return x + y;
        }
    };
    public static Operation MINUS = new Operation("-") {

        protected double eval(double x, double y) {
            return x - y;
        }
    };
    public static Operation TIMES = new Operation("*") {

        protected double eval(double x, double y) {
            return x * y;
        }
    };
    public static Operation DIVIDE = new Operation("/") {

        protected double eval(double x, double y) {
            return x / y;
        }
    };

    // Perform arithmetic operation represented by this constant
    protected abstract double eval(double x, double y);

    public String toString() {
        return this.name;
    }

    // Prevent subclasses from overriding Object.equals
    public final boolean equals(Object that) {
        return super.equals(that);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    // The 4 declarations below are necessary for serialization
    private static int nextOrdinal = 0;
    private final int ordinal = nextOrdinal++;
    private static final Operation[] VALUES = {PLUS, MINUS, TIMES, DIVIDE};

    Object readResolve() throws ObjectStreamException {
        return VALUES[ordinal]; // Canonicalize
    }
}
