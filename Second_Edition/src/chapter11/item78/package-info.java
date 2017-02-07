/**
 * Item 78: Consider serialization proxies instead of serialized instances.
 * *
 * {@link chapter11.item78.Period} class with serialization proxy.
 * *
 * Like the defensive copying approach,
 * the serialization proxy approach stops the bogus byte-stream attack ({@link chapter11.item78.BogusPeriod})
 * and the internal field theft attack ({@link chapter11.item78.MutablePeriod}) dead in their tracks.
 * *
 * @see java.util.EnumSet.SerializationProxy ... also.
 * *
 * The serialization proxy pattern has two limitations:
 * It is not compatible with classes that are extendable by their clients (Item 17).
 * Also, it is not compatible with some classes whose object graphs contain circularities.
 * *
 * In summary,
 * consider the serialization proxy pattern whenever you find yourself having to write a readObject
 * or writeObject method on a class that is not extendable by its clients.
 * This pattern is perhaps the easiest way to robustly serialize objects with nontrivial invariants.
 */
package chapter11.item78;