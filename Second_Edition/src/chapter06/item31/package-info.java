/**
 * Item 31: Use instance fields instead of ordinals.
 * *
 * Never derive a value associated with an enum from its ordinal;
 * store it in an instance field instead: {@link chapter06.item31.Ensemble}.
 * *
 * The Enum specification has this to say about ordinal: “Most programmers will have no use for this method.
 * It is designed for use by general-purpose enum-based data structures such as EnumSet and EnumMap.”
 * Unless you are writing such a data structure, you are best off avoiding the ordinal method entirely.
 */
package chapter06.item31;