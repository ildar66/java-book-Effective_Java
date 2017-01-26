/**
 * Item 61: Throw exceptions appropriate to the abstraction.
 * *
 * Higher layers should catch lower-level exceptions and, in their place, throw exceptions
 * that can be explained in terms of the higher-level abstraction: {@link chapter09.item61.Sample}.
 * *
 * A special form of exception translation called exception chaining.
 * *
 * While exception translation is superior to mindless propagation of exceptions from lower layers, it should not be overused.
 * You can do this by checking the validity of the higher-level method’s parameters before passing them on to lower layers.
 * *
 * In summary, if it isn’t feasible to prevent or to handle exceptions from lower layers, use exception translation,
 * unless the lower-level method happens to guarantee that all of its exceptions are appropriate to the higher level.
 * Chaining provides the best of both worlds: it allows you to throw an appropriate higher-level exception,
 * while capturing the underlying cause for failure analysis (Item 63).
 */
package chapter09.item61;