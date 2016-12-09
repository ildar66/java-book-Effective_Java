package chapter_4.item_13;

/**
 * Many of the example classes in previous items are immutable. One such class is PhoneNumber
 * in Item 8, which has accessors for each attribute but no corresponding mutators. Here is
 * a slightly more complex example:
 * This class represents a complex number (a number with both real and imaginary parts). In
 * addition to the standard Object methods, it provides accessors for the real and imaginary
 * parts and provides the four basic arithmetic operations: addition, subtraction, multiplication,
 * and division.
 */

public final class Complex {

    private final float re;
    private final float im;

    public Complex(float re, float im) {
        this.re = re;
        this.im = im;
    }

    // Accessors with no corresponding mutators
    public float realPart() {
        return re;
    }

    public float imaginaryPart() {
        return im;
    }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im,
                           re * c.im + im * c.re);
    }

    public Complex divide(Complex c) {
        float tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                           (im * c.re - re * c.im) / tmp);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
        return (Float.floatToIntBits(re) == // See page 33 to
                Float.floatToIntBits(c.re)) && // find out why
                (Float.floatToIntBits(im) == // floatToIntBits
                        Float.floatToIntBits(im)); // is used.
    }

    public int hashCode() {
        int result = 17 + Float.floatToIntBits(re);
        result = 37 * result + Float.floatToIntBits(im);
        return result;
    }

    public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}