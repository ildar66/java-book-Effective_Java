/**
 * Item 54: Use native methods judiciously.
 * *
 * It is rarely advisable to use native methods for improved performance.
 * *
 * Native languages are not safe (Item 39),
 * applications using native methods are no longer immune to memory corruption errors.
 * *
 * Native languages are platform dependent,
 * applications using native methods are far less portable.
 * *
 * In summary, think twice before using native methods. Rarely, if ever, use them for improved performance.
 * If you must use native methods to access low-level resources or legacy libraries,
 * use as little native code as possible and test it thoroughly.
 * A single bug in the native code can corrupt your entire application.
 */
package chapter08.item54;