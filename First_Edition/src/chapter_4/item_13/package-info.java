/**
 * Item 13: Favor immutability.
 * To make a class immutable, follow these five rules:
 *
 * 1. Don't provide any methods that modify the object (known as mutators).
 *
 * 2. Ensure that no methods may be overridden.
 *      This prevents careless or malicious subclasses from compromising the immutable behavior of the class.
 *      Preventing method overrides is generally done by making the class final, but there are alternatives that we'll discuss later.
 *
 * 3. Make all fields final.
 *      This clearly expresses your intentions in a manner that is enforced by the system. Also, it may be necessary to ensure correct behavior if
 *      a reference to a newly created instance is passed from one thread to another without synchronization, depending on the results of ongoing
 *      efforts to rework the memory model [Pugh01a].
 *
 * 4. Make all fields private.
 *      This prevents clients from modifying fields directly. While it is technically permissible for immutable classes to have public final
 *      fields containing primitive values or references to immutable objects, it is not recommended because it precludes changing the internal
 *      representation in a later release (Item 12).
 *
 * 5. Ensure exclusive access to any mutable components.
 *      If your class has any fields that refer to mutable objects, ensure that clients of the class cannot obtain references to these objects.
 *      Never initialize such a field to a client-provided object reference nor return the object reference from an accessor.
 *      Make defensive copies (Item 24) in contructors, accessors, and readObject methods (Item 56).
 */
package chapter_4.item_13;