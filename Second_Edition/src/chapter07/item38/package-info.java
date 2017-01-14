/**
 * Item 38: Check parameters for validity.
 * *
 * You should check a method’s parameters before performing its computation
 * (An important exception is the case in which the validity check would be expensive or impractical and the validity check is performed implicitly
 * in the process of doing the computation).
 * *
 * For public methods, use the Javadoc @throws tag to document the exception that will be thrown if a restriction on parameter values is violated
 * (Item 62). Typically the exception will be IllegalArgumentException, IndexOutOfBounds182 Exception, or NullPointerException (Item 60).
 * @see chapter07.item38.Sample
 * Nonpublic methods should generally check their parameters using assertions.
 * *
 * Constructors represent a special case of the principle that you should check the validity of parameters that are to be stored away for later use.
 * *
 * To summarize, each time you write a method or constructor, you should think about what restrictions exist on its parameters.
 * You should document these restrictions and enforce them with explicit checks at the beginning of the method body.
 * It is important to get into the habit of doing this.
 * The modest work that it entails will be paid back with interest the first time a validity check fails.
 */
package chapter07.item38;