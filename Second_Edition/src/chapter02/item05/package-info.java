/**
 * Item 5: Avoid creating unnecessary objects.
 * *
 * You can often avoid creating unnecessary objects by using static factory methods (Item 1)
 * in preference to constructors on immutable classes that provide both.
 * For example, the static factory method Boolean.valueOf(String) is almost always preferable to the constructor Boolean(String).
 * *
 * In addition to reusing immutable objects, you can also reuse mutable objects if you know they won’t be modified.
 * see {@link chapter02.item05.fastversion.Person}
 * *
 * Prefer primitives to boxed primitives, and watch out for unintentional autoboxing. see {@link chapter02.item05.Sum}
 */
package chapter02.item05;