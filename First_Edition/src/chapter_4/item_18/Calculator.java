package chapter_4.item_18;

/**
 * Typical use of a public static member class.
 */
public class Calculator {

    public static abstract class Operation {

        private final String name;

        Operation(String name) {
            this.name = name;
        }

        public String toString() {
            return this.name;
        }

        // Perform arithmetic op represented by this constant
        abstract double eval(double x, double y);

        // Doubly nested anonymous classes
        public static final Operation PLUS = new Operation("+") {

            double eval(double x, double y) {
                return x + y;
            }
        };
        public static final Operation MINUS = new Operation("-") {

            double eval(double x, double y) {
                return x - y;
            }
        };
        public static final Operation TIMES = new Operation("*") {

            double eval(double x, double y) {
                return x * y;
            }
        };
        public static final Operation DIVIDE = new Operation("/") {

            double eval(double x, double y) {
                return x / y;
            }
        };
    }

    // Return the results of the specified calculation
    public double calculate(double x, Operation op, double y) {
        return op.eval(x, y);
    }
}