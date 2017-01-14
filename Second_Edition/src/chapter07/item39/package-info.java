/**
 * Item 39: Make defensive copies when needed.
 * *
 * You must program defensively, with the assumption that clients of your class will do their best to destroy its invariants.
 * *
 * Broken "immutable" time period class: {@link chapter07.item39.Period}.
 * @see chapter07.item39.Attack the internals of a Period instance.
 * *
 * Make a defensive copy of each mutable parameter to the constructor.
 * Repaired constructor - makes defensive copies of parameters: {@link chapter07.item39.Period}(commented constructor)
 * Defensive copies are made before checking the validity of the parameters (Item 38),
 * and the validity check is performed on the copies rather than on the originals.
 * Do not use the clone method to make a defensive copy of a parameter whose type is subclassable by untrusted parties.
 * *
 * Second attack on the internals of a Period instance: {@link chapter07.item39.Attack}.
 * To defend against the second attack, merely modify the accessors to return defensive copies of mutable internal fields:
 * {@link chapter07.item39.Period}(commented).
 * *
 * In summary, if a class has mutable components that it gets from or returns to its clients, the class must defensively copy these components.
 * If the cost of the copy would be prohibitive and the class trusts its clients not to modify the components inappropriately,
 * then the defensive copy may be replaced by documentation outlining the client’s responsibility not to modify the affected components.
 */
package chapter07.item39;