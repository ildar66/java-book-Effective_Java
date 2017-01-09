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
 * *
 * // Two possible declarations for the swap method: @see {@link chapter05.item28.Swap}
 * public static <E> void swap(List<E> list, int i, int j);
 * public static void swap(List<?> list, int i, int j);
 * As a rule, if a type parameter appears only once in a method declaration, replace it with a wildcard.
 * If it’s an unbounded type parameter, replace it with an unbounded wildcard;
 * if it’s a bounded type parameter, replace it with a bounded wildcard.
 * *
 * In summary, using wildcard types in your APIs, while tricky, makes the APIs far more flexible.
 * If you write a library that will be widely used, the proper use of wildcard types should be considered mandatory.
 * Remember the basic rule: producer-extends, consumer-super (PECS).
 * And remember that all comparables and comparators are consumers.
 */
package chapter05.item28;