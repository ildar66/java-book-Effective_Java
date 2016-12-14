/**
 * Item 24: Make defensive copies when needed.
 *
 * You must program defensively with the assumption that clients of your class will do their best to destroy its invariants.
 *
 * Defensive copies are made before checking the validity of the parameters (Item 23),
 * and the validity check is performed on the copies rather than on the originals.
 *
 * Do not use the clone method to make a defensive copy of a parameter whose type is subclassable by untrusted parties.
 */
package chapter_6.item_24;