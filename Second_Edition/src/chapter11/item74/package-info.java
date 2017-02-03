/**
 * Item 74: Implement Serializable judiciously.
 * *
 * A major cost of implementing Serializable is that it decreases the flexibility to change a class’s implementation once it has been released.
 * *
 * A second cost of implementing Serializable is that it increases the likelihood of bugs and security holes.
 * Deserialization is a “hidden constructor”.
 * *
 * A third cost of implementing Serializable is that it increases the testing burden associated with releasing a new version of a class.
 * *
 * Implementing the Serializable interface is not a decision to be undertaken lightly.
 * *
 * Classes designed for inheritance (Item 17) should rarely implement Serializable, and interfaces should rarely extend it.
 * *
 * You should consider providing a parameterless constructor on nonserializable classes designed for inheritance.
 * @see chapter11.item74.AbstractFoo and {@link chapter11.item74.Foo}.
 * *
 * Inner classes (Item 22) should not implement Serializable. The default serialized form of an inner class is illdefined.
 * A static member class can, however, implement Serializable.
 * *
 * To summarize, the ease of implementing Serializable is specious.
 * Unless a class is to be thrown away after a short period of use,
 * implementing Serializable is a serious commitment that should be made with care.
 * Extra caution is warranted if a class is designed for inheritance.
 * For such classes, an intermediate design point between implementing Serializable
 * and prohibiting it in subclasses is to provide an accessible parameterless constructor.
 * This design point permits, but does not require, subclasses to implement Serializable.
 */
package chapter11.item74;