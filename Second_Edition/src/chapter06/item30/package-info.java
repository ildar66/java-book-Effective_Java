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
 * Enum type with constant-specific method implementations: {@link chapter06.item30.Operation}
 */
package chapter06.item30;