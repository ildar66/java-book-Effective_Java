/**
 * Item 23: Check parameters for validity.
 *
 * To summarize, each time you write a method or constructor, you should think about what
 * restrictions exist on its parameters. You should document these restrictions and enforce them
 * with explicit checks at the beginning of the method body. It is important to get into the habit
 * of doing this; the modest work that it entails will be paid back with interest the first time a
 * validity check fails.

 * Once you've documented the restrictions on a method's parameters and you've
 * documented the exceptions that will be thrown if these restrictions are violated, it is a simple
 * matter to enforce the restrictions. Here's a typical example:
 * (nonpublic methods should generally check their parameters using assertions rather than normal checks)
 */

/**
 * Returns a BigInteger whose value is (this mod m). This method
 * differs from the remainder method in that it always returns a
 * nonnegative BigInteger.
 *
 * @param m the modulus, which must be positive.
 * @return this mod m.
 * @throws ArithmeticException if m <= 0.
 */
/*
public BigInteger mod(BigInteger m) {
   if (m.signum() <= 0)
        throw new ArithmeticException("Modulus not positive");
   ... // Do the computation
   }
 */
package chapter_6.item_23;