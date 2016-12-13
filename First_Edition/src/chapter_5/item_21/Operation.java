package chapter_5.item_21;

// Typesafe enum with behaviors attached to constants
public abstract class Operation {

    private final String name;

    Operation(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    // Perform arithmetic operation represented by this constant
    abstract double eval(double x, double y);

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
    public static final Operation DIVIDED_BY =
            new Operation("/") {

                double eval(double x, double y) {
                    return x / y;
                }
            };
}
