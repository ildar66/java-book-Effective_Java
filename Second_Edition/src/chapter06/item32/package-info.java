/**
 * Item 32: Use EnumSet instead of bit fields.
 * *
 * @see chapter06.item32.Text
 * *
 * In summary, just because an enumerated type will be used in sets, there is no reason to represent it with bit fields.
 * The EnumSet class combines the conciseness and performance of bit fields with all the many advantages of enum types described in Item 30.
 * The one real disadvantage of EnumSet is that it is not, as of release 1.6, possible to create an immutable EnumSet,
 * but this will likely be remedied in an upcoming release. In the meantime, you can wrap an EnumSet with Collections.unmodifiableSet,
 * but conciseness and performance will suffer.
 */
package chapter06.item32;