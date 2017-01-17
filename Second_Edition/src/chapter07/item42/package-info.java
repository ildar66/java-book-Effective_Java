/**
 * Item 42: Use varargs judiciously.
 * *
 * Simple use of varargs:  {@link chapter07.item42.Varargs}.
 * *
 * The WRONG(commented) and right way to use varargs to pass one or more arguments: {@link chapter07.item42.Varargs}.
 * *
 * Don’t retrofit every method that has a final array parameter;
 * use varargs only when a call really operates on a variable-length sequence of values
 * (unfortunate decision to retrofit Arrays.asList as a varargs method in release 1.5).
 * *
 * In summary, varargs methods are a convenient way to define methods that require a variable number of arguments,
 * but they should not be overused. They can produce confusing results if used inappropriately.
 */
package chapter07.item42;