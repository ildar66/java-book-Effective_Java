/**
 * Item 57: Use exceptions only for exceptional conditions.
 * *
 * Exceptions are, as their name implies, to be used only for exceptional conditions; they should never be used for ordinary control flow.
 * *
 * A well-designed API must not force its clients to use exceptions for ordinary control flow.
 * *
 * In summary, exceptions are designed for use in exceptional conditions.
 * Don’t use them for ordinary control flow, and don’t write APIs that force others to do so.
 */
package chapter09.item57;