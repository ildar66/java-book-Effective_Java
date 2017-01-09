/**
 * Item 28: Use bounded wildcards to increase API flexibility.
 * *
 * For maximum flexibility, use wildcard types on input parameters that represent producers or consumers: {@link chapter05.item28.Stack}.
 * *
 * List-based generic reduction with wildcard type: @see {@link chapter05.item28.Reduction}.
 * *
 * Explicit type parameter:  @see {@link chapter05.item28.Union}
 * *
 * Do not use wildcard types as return types.
 * If the user of a class has to think about wildcard types, there is probably something wrong with the class’s API.
 * *
 * Comparables are always consumers, so you should always use Comparable<? super T> in preference to Comparable<T>.
 * The same is true of comparators, so you should always use Comparator<? super T> in preference to Comparator<T>.
 * Using a recursive type bound with wildcards: @see {@link chapter05.item28.RecursiveTypeBound}.
 */
package chapter05.item28;