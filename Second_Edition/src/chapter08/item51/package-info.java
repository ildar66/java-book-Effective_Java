/**
 * Item 51: Beware the performance of string concatenation.
 * *
 * Using the string concatenation operator repeatedly to concatenate n strings requires time quadratic in n.
 * To achieve acceptable performance, use a StringBuilder in place of a String: {@link chapter08.item51.Sample}.
 * *
 * The moral is simple:
 * don’t use the string concatenation operator to combine more than a few strings unless performance is irrelevant.
 * Use StringBuilder’s append method instead.
 * Alternatively, use a character array, or process the strings one at a time instead of combining them.
 */
package chapter08.item51;