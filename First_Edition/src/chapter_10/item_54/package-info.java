/**
 * Item 54: Implement Serializable judiciously.
 * *
 * A major cost of implementing Serializable is that it decreases the flexibility to change a class's implementation once it has been released.
 * *
 * A second cost of implementing Serializable is that it increases the likelihood of bugs and security holes.
 * *
 * A third cost of implementing Serializable is that it increases the testing burden associated with releasing a new version of a class.
 * *
 * Implementing the Serializable interface is not a decision to be undertaken lightly.
 * *
 * Classes designed for inheritance (Item 15) should rarely implement Serializable, and interfaces should rarely extend it.
 * *
 * you should consider providing a parameterless constructor on nonserializable classes designed for inheritance.
 * @see chapter_10.item_54.Foo
 */
package chapter_10.item_54;