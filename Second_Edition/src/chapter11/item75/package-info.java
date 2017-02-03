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
 */
package chapter11.item75;