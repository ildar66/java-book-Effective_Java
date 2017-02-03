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
 */
package chapter11.item75;