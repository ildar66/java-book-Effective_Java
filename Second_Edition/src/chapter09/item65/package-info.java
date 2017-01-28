/**
 * Item 65: Don’t ignore exceptions.
 * *
 * An empty catch block defeats the purpose of exceptions.
 * At the very least, the catch block should contain a comment explaining why it is appropriate to ignore the exception.
 * *
 * The advice in this item applies equally to checked and unchecked exceptions.
 * Whether an exception represents a predictable exceptional condition or a programming error,
 * ignoring it with an empty catch block will result in a program that continues silently in the face of error.
 */
package chapter09.item65;