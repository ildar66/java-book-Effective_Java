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
 */
package chapter05.item28;