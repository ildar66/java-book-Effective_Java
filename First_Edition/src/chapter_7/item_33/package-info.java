/**
 * Item 33: Beware the performance of string concatenation.
 *
 * Using the string concatenation operator repeatedly to concatenate n strings requires time quadratic in n.
 *
 * // Inappropriate use of string concatenation - Performs horribly!
 * public String statement() {
 * String s = "";
 * for (int i = 0; i < numItems(); i++)
 * s += lineForItem(i); // String concatenation
 * return s;
 * }
 * 
 * To achieve acceptable performance, use a StringBuffer in place of a String:
 * public String statement() {
 * StringBuffer s = new StringBuffer(numItems() * LINE_WIDTH);
 * for (int i = 0; i < numItems(); i++)
 * s.append(lineForItem(i));
 * return s.toString();
 * }
 */
package chapter_7.item_33;