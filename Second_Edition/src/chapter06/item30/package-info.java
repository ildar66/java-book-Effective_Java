/**
 * Item 30: Use enums instead of int constants.
 * *
 * Enum types are effectively final, by virtue of having no accessible constructors.
 * Enums provide compile-time type safety.
 * Enum types with identically named constants coexist peacefully because each type has its own namespace.
 * *
 * Enum types let you add arbitrary methods and fields and implement arbitrary interfaces.
 * They provide high-quality implementations of all the Object methods (Chapter 3),
 * they implement Comparable (Item 12) and Serializable (Chapter 11),
 * and their serialized form is designed to withstand most changes to the enum type.
 * *
 * To associate data with enum constants, {@link chapter06.item30.Planet}
 * declare instance fields and write a constructor that takes the data and stores it in the fields.
 * *
 * Enum type with constant-specific method implementations: {@link chapter06.item30.Operation}.
 * *
 * The strategy enum pattern: {@link chapter06.item30.PayrollDay}.
 * *
 * Switches on enums are good for augmenting external enum types with constant-specific behavior.
 * For example, suppose the Operation enum is not under your control, and you wish it had an instance method
 * to return the inverse of each operation. You can simulate the effect with the following static method:
 * // Switch on an enum to simulate a missing method
 * public static Operation inverse(Operation op) {
 *  switch(op) {
 *      case PLUS: return Operation.MINUS;
 *      case MINUS: return Operation.PLUS;
 *      case TIMES: return Operation.DIVIDE;
 *      case DIVIDE: return Operation.TIMES;
 *      default: throw new AssertionError("Unknown op: " + op);
 *  }
 * }
 **
    In summary, the advantages of enum types over int constants are compelling.
    Enums are far more readable, safer, and more powerful. Many enums require no explicit constructors or members,
    but many others benefit from associating data with each constant and providing methods whose behavior is affected by this data.
    Far fewer enums benefit from associating multiple behaviors with a single method.
    In this relatively rare case, prefer constant-specific methods to enums that switch on their own values.
    Consider the strategy enum pattern if multiple enum constants share common behaviors.
 */
package chapter06.item30;