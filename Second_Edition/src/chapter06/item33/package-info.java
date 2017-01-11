/**
 * Item 33: Use EnumMap instead of ordinal indexing.
 * *
 * Using an EnumMap to associate data with an enum: {@link chapter06.item33.Herb}.
 * *
 * Using a nested EnumMap to associate data with enum pairs: {@link chapter06.item33.Phase}.
 * *
 * In summary, it is rarely appropriate to use ordinals to index arrays: use EnumMap instead.
 * If the relationship that you are representing is multidimensional, use EnumMap<..., EnumMap<...>>.
 * This is a special case of the general principle that application programmers should rarely, if ever, use Enum.ordinal (Item 31).
 */
package chapter06.item33;