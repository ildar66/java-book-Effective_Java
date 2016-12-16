/**
 * Item 34: Refer to objects by their interfaces.
 *
 * // Good - uses interface as type:
 * List subscribers = new Vector();
 *
 * // Bad - uses class as type!
 * Vector subscribers = new Vector();
 *
 * If you get into the habit of using interfaces as types, your program will be much more flexible.
 *
 * It is entirely appropriate to refer to an object by a class rather than an interface if no appropriate interface exists.
 */
package chapter_7.item_34;