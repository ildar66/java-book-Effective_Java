/**
 * Item 75: Consider using a custom serialized form.
 * *
 * Do not accept the default serialized form without first considering whether it is appropriate.
 * *
 * The default serialized form is likely to be appropriate if an object’s physical representation is identical to its logical content.
 * Good candidate for default serialized form: {@link chapter11.item75.Name}.
 * *
 * Even if you decide that the default serialized form is appropriate,
 * you often must provide a readObject method to ensure invariants and security.
 * In the case of {@link chapter11.item75.Name}, the readObject method must ensure that lastName and firstName are non-null (Items 76 and 78).
 * *
 * Using the default serialized form when an object’s physical representation differs substantially from its logical data content
 * has four disadvantages:
 * • It permanently ties the exported API to the current internal representation.
 * • It can consume excessive space.
 * • It can consume excessive time.
 * • It can cause stack overflows.
 * @see chapter11.item75.StringList with a reasonable custom serialized form.
 * *
 * If all instance fields are transient, it is technically permissible to dispense with invoking defaultWriteObject and defaultReadObject,
 * but it is not recommended.
 * *
 * Before deciding to make a field nontransient, convince yourself that its value is part of the logical state of the object.
 * *
 * You must impose any synchronization on object serialization that you would impose on any other method
 * that reads the entire state of the object.
 * // writeObject for synchronized class with default serialized form:
 * private synchronized void writeObject(ObjectOutputStream s) throws IOException {s.defaultWriteObject();}
 * *
 * Regardless of what serialized form you choose, declare an explicit serial version UID in every serializable class you write.
 * // Declaring a serial version UID is simple. Just add this line to your class:
 * private static final long serialVersionUID = "randomLongValue" ;
 * If you write a new class, it doesn’t matter what value you choose for "randomLongValue".
 * *
 * To summarize,
 * when you have decided that a class should be serializable(Item 74), think hard about what the serialized form should be.
 * Use the default serialized form only if it is a reasonable description of the logical state of the object;
 * otherwise design a custom serialized form that aptly describes the object.
 * You should allocate as much time to designing the serialized form of a class as you allocate to designing its exported methods (Item 40).
 * Just as you cannot eliminate exported methods from future versions, you cannot eliminate fields from the serialized form;
 * they must be preserved forever to ensure serialization compatibility.
 * Choosing the wrong serialized form can have a permanent, negative impact on the complexity and performance of a class.
 */
package chapter11.item75;