/**
 * Item 30: Know and use the libraries.
 * By using a standard library, you take advantage of the knowledge of the experts who wrote it and the experience of those who used it before you.
 * Numerous features are added to the libraries in every major release, and it pays to keep abreast of these additions.
 * Every programmer should be familiar with the contents of java.lang, java.util, and, to a lesser extent, java.io.
 * There are many additions to the libraries in the 1.4 release. Notable additions include the following:
 * • java.util.regex— A full-blown Perl-like regular expression facility.
 * • java.util.prefs— A facility for the persistent storage of user preferences and program configuration data.
 * • java.nio— A high-performance I/O facility, including scalable I/O (akin to the Unix poll call) and memory-mapped I/O (akin to the Unix mmap
 * call).
 * • java.util.LinkedHashSet, LinkedHashMap, IdentityHashMap— New collection implementations.
 * To summarize, don't reinvent the wheel. If you need to do something that seems reasonably
 * common, there may already be a class in the libraries that does what you want. If there is, use
 * it; if you don't know, check. Generally speaking, library code is likely to be better than code
 * that you'd write yourself and is likely to improve over time. This is no reflection on your
 * abilities as a programmer; economies of scale dictate that library code receives far more
 * attention than the average developer could afford to devote to the same functionality.
 */
package chapter_7.item_30;