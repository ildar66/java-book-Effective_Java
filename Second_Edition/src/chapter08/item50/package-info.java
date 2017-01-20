/**
 * Item 50: Avoid strings where other types are more appropriate.
 * *
 * Strings are poor substitutes for other value types.
 * *
 * Strings are poor substitutes for enum types.
 * As discussed in Item 30({@link chapter06.item30}), enums make far better enumerated type constants than strings.
 * *
 * Strings are poor substitutes for aggregate types.
 * // Inappropriate use of string as aggregate type:
 * // String compoundKey = className + "#" + i.next();
 * You can’t provide equals, toString, or compareTo methods
 * *
 * Strings are poor substitutes for capabilities. {@link chapter08.item50.ThreadLocalHistory}
 * *
 * To summarize, avoid the natural tendency to represent objects as strings when better data types exist or can be written.
 * Used inappropriately, strings are more cumbersome, less flexible, slower, and more error-prone than other types.
 * Types for which strings are commonly misused include primitive types, enums, and aggregate types.
 */
package chapter08.item50;