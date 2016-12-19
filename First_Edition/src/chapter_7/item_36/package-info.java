/**
 * Item 36: Use native methods judiciously.
 * As of release 1.3, it is rarely advisable to use native methods for improved performance.
 *
 * The use of native methods has serious disadvantages. Because native languages are not safe
 * (Item 24), applications using native methods are no longer immune to memory corruption
 * errors. Because native languages are platform dependent, applications using native methods
 * are no longer freely portable. Native code must be recompiled for each target platform and
 * may require modification as well. There is a high fixed cost associated with going into and out
 * of native code, so native methods can decrease performance if they do only a small amount of
 * work. Finally, native methods are tedious to write and difficult to read.
 *
 * In summary, think twice before using native methods. Rarely, if ever, use them for improved
 * performance. If you must use native methods to access low-level resources or legacy libraries,
 * use as little native code as possible and test it thoroughly. A single bug in the native code can
 * corrupt your entire application.
 */
package chapter_7.item_36;