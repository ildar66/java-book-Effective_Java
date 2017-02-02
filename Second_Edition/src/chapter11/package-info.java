/**
 * Serialization.
 * *
 * THIS chapter concerns the object serialization API,
 * which provides a framework for encoding objects as byte streams and reconstructing objects from their byte-stream encodings.
 * Encoding an object as a byte stream is known as serializing the object; the reverse process is known as deserializing it.
 * Once an object has been serialized, its encoding can be transmitted from one running virtual machine to another
 * or stored on disk for later deserialization.
 * Serialization provides the standard wire-level object representation for remote communication,
 * and the standard persistent data format for the JavaBeans component architecture.
 * A notable feature of this chapter is the serialization proxy pattern (Item 78),
 * which can help you avoid many of the pitfalls of object serialization.
 */
package chapter11;