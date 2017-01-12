/**
 * Item 34: Emulate extensible enums with interfaces.
 * *
 * In summary, while you cannot write an extensible enum type,
 * you can emulate it by writing an interface to go with a basic enum type that implements the interface.
 * This allows clients to write their own enums that implement the interface.
 * These enums can then be used wherever the basic enum type can be used, assuming APIs are written in terms of the interface.
 * *
 * @see chapter06.item34.ExtendedOperation
 * *
 * A minor disadvantage of the use of interfaces to emulate extensible enums is
 * that implementations cannot be inherited from one enum type to another.
 * If there were a larger amount of shared functionality,
 * you could encapsulate it in a helper class or a static helper method to eliminate the code duplication.
 */
package chapter06.item34;