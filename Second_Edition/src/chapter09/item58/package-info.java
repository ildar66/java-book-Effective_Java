/**
 * Item 58: Use checked exceptions for recoverable conditions and runtime exceptions for programming errors.
 * *
 * Use checked exceptions for conditions from which the caller can reasonably be expected to recover.
 * *
 * Use runtime exceptions to indicate programming errors.
 * All of the unchecked throwables you implement should subclass RuntimeException (directly or indirectly).
 * *
 * To summarize, use checked exceptions for recoverable conditions and runtime exceptions for programming errors.
 * If it isn’t clear whether recovery is possible, you’re probably better off using an unchecked exception.
 */
package chapter09.item58;