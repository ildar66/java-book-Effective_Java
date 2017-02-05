/**
 * Item 76: Write readObject methods defensively.
 * *
 * When an object is deserialized, it is critical to defensively copy any field containing an object reference that a client must not possess.
 * @see chapter11.item76.MutablePeriod
 * readObject method with defensive copying and validity checking: {@link chapter11.item76.Period#readObject(java.io.ObjectInputStream)}.
 * *
 * Do not use the writeUnshared and readUnshared methods.
 * They are typically faster than defensive copying, but they don’t provide the necessary safety guarantee.
 * *
 * To summarize, anytime you write a readObject method, adopt the mind-set that you are writing a public constructor
 * that must produce a valid instance regardless of what byte stream it is given.
 * Do not assume that the byte stream represents an actual serialized instance.
 * While the examples in this item concern a class that uses the default serialized form,
 * all of the issues that were raised apply equally to classes with custom serialized forms.
 * *
 * Here, in summary form, are the guidelines for writing a bulletproof readObject method:
 * • For classes with object reference fields that must remain private, defensively copy each object in such a field.
 * Mutable components of immutable classes fall into this category.
 * • Check any invariants and throw an InvalidObjectException if a check fails. The checks should follow any defensive copying.
 * • If an entire object graph must be validated after it is deserialized, use the ObjectInputValidation interface [JavaSE6, Serialization].
 * • Do not invoke any overridable methods in the class, directly or indirectly.
 */
package chapter11.item76;