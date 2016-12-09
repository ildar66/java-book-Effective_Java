package chapter_4.item_13;

/**
 * Immutable class with static factories instead of constructors.
 */
public class Complex2 {

    private final float re;
    private final float im;

    private Complex2(float re, float im) {
        this.re = re;
        this.im = im;
    }

    public static Complex2 valueOf(float re, float im) {
        return new Complex2(re, im);
    }

    /**
     * Static factories have many other advantages over constructors, as discussed in Item 1. For
     * example, suppose that you want to provide a means of creating a complex number based on
     * its polar coordinates. This would be very messy using constructors because the natural
     * constructor would have the same signature that we already used: Complex(float, float).
     * With static factories it's easy; just add a second static factory with a name that clearly
     * identifies its function:
     */
    public static Complex valueOfPolar(float r, float theta) {
        return new Complex((float) (r * Math.cos(theta)),
                           (float) (r * Math.sin(theta)));
    }

    // ... // Remainder unchanged
}
