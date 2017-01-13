/**
 * Item 37: Use marker interfaces to define types.
 * *
 * Marker interfaces define a type that is implemented by instances of the marked class;
 * marker annotations do not.
 * *
 * In summary, marker interfaces and marker annotations both have their uses:
 * If you want to define a type that does not have any new methods associated with it, a marker interface is the way to go.
 * *
 * If you want to mark program elements other than classes and interfaces,
 * to allow for the possibility of adding more information to the marker in the future,
 * or to fit the marker into a framework that already makes heavy use of annotation types,
 * then a marker annotation is the correct choice.
 * *
 * If you find yourself writing a marker annotation type whose target is ElementType.TYPE,
 * take the time to figure out whether it really should be an annotation type, or whether a marker interface would be more appropriate.
 * *
 * In a sense, this item is the inverse of Item 19, which says, “If you don’t want to define a type, don’t use an interface.”
 * To a first approximation, this item says, “If you do want to define a type, do use an interface.”
 */
package chapter06.item37;