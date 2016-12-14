/**
 * Item 24: Make defensive copies when needed.
 *
 * You must program defensively with the assumption that clients of your class will do their best to destroy its invariants.
 *
 * Defensive copies are made before checking the validity of the parameters (Item 23),
 * and the validity check is performed on the copies rather than on the originals.
 *
 * Do not use the clone method to make a defensive copy of a parameter whose type is subclassable by untrusted parties.
 *
 * Arguably, the real lesson in all of this is that you should, where possible, use immutable
     objects as components of your objects so that you that don't have to worry about defensive
     copying (Item 13). In the case of our Period example, it is worth pointing out that
     experienced programmers often use the primitive long returned by Date.getTime() as
     an internal time representation rather than using a Date object reference. They do this
     primarily because Date is mutable.
 *
 */
package chapter_6.item_24;