/**
 * Item 55:Consider using a custom serialized form.
 * *
 * Do not accept the default serialized form without first considering whether it is appropriate.
 * *
 * The default serialized form is likely to be appropriate if an object's physical representation is identical to its logical content.
 * @see chapter_10.item_55.Name
 * *
 * Even if you decide that the default serialized form is appropriate, you often must provide a readObject method to ensure invariants and security.
 * In the case of Name, the readObject method could ensure that lastName and firstName were non-null. This issue is discussed at length in Item 56.
 * *
 * Awful candidate for default serialized form @see {@link chapter_10.item_55.awful_default_serial.StringList}
 * Using the default serialized form when an object's physical representation differs
 * substantially from its logical data content has four disadvantages:
 * • It permanently ties the exported API to the internal representation.
 * • It can consume excessive space.
 * • It can consume excessive time.
 * • It can cause stack overflows.
 * *
 * @see chapter_10.item_55.StringList with a reasonable custom serialized form.
 * *
 * Before deciding to make a field nontransient, convince yourself that its value is part of the logical state of the object.
 * *
 * Regardless of what serialized form you choose, declare an explicit serial version UID in every serializable class you write.
 * *
 * To summarize, when you have decided that a class should be serializable (Item 54), think hard
 * about what the serialized form should be. Only use the default serialized form if it is a
 * reasonable description of the logical state of the object; otherwise design a custom serialized
 * form that aptly describes the object. You should allocate as much time to designing the
 * serialized form of a class as you allocate to designing its exported methods. Just as you cannot
 * eliminate exported methods from future versions, you cannot eliminate fields from the
 * serialized form; they must be preserved forever to ensure serialization compatibility.
 * Choosing the wrong serialized form can have permanent, negative impact on the complexity
 * and performance of a class.
 */
package chapter_10.item_55;