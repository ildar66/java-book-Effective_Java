/**
 * Item 52: Document thread safety.
 * *
 * The presence of the synchronized modifier in a method declaration is an implementation detail, not a part of the exported API.
 * *
 * To enable safe multithreaded use, a class must clearly document in prose the level of thread safety that it supports.
 * The following list summarizes the levels of thread safety that a class can support:
 * • immutable— Instances of this class appear constant to their clients.
 * No external synchronization is necessary. Examples include String, Integer, and BigInteger (Item 13).
 * • thread-safe— Instances of this class are mutable, but all methods contain sufficient internal synchronization
 * that instances may be used concurrently without the need for external synchronization.
 * Concurrent invocations will appear to execute serially in some globally consistent order. Examples include Random and java.util.Timer.
 * • conditionally thread-safe— Like thread-safe, except that the class (or an associated class) contains methods
 * that must be invoked in sequence without interference from other threads.
 * To eliminate the possibility of interference, the client must obtain an appropriate lock for the duration of the sequence.
 * Examples include Hashtable and Vector, whose iterators require external synchronization.
 * • thread-compatible— Instances of this class can safely be used concurrently by surrounding each method invocation
 * (and in some cases, each sequence of method invocations) by external synchronization.
 * Examples include the general purpose collection implementations, such as ArrayList and HashMap.
 * • thread-hostile— This class is not safe for concurrent use by multiple threads, even if all method invocations are surrounded
 * by external synchronization. Typically, thread hostility stems from the fact that methods modify static data that affect other threads.
 * Luckily, there are very few thread-hostile classes or methods in the platform libraries.
 * The System.runFinalizersOnExit method is thread-hostile, and has been deprecated.
 * *
 * To summarize, every class should clearly document its thread-safety properties. The only way
 * to do this is to provide carefully worded prose descriptions. The synchronized modifier
 * plays no part in documenting the thread safety of a class. It is, however, important for
 * conditionally thread-safe classes to document which object must be locked to allow sequences
 * of method invocations to execute atomically. The description of a class's thread safety
 * generally belongs in the class's documentation comment, but methods with special threadsafety
 * properties should describe these properties in their own documentation comments.
 */
package chapter_9.item_52;