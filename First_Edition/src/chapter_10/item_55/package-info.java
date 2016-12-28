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
 */
package chapter_10.item_55;