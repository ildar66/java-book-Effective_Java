/**
 * Item 40:Use checked exceptions for recoverable conditions and run-time exceptions for programming errors.
 * Use checked exceptions for conditions from which the caller can reasonably be expected to recover.
 * Use run-time exceptions to indicate programming errors.
 * All of the unchecked throwables you implement should subclass RuntimeException(directly or indirectly).
 * To summarize, use checked exceptions for recoverable conditions and run-time exceptions for programming errors.
 */
package chapter_8.item_40;