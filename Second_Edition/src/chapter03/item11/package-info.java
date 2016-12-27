/**
 * Item 11: Override clone judiciously.
 * *
 * If you override the clone method in a nonfinal class, you should return an object obtained by invoking super.clone.
 * *
 * In practice, a class that implements Cloneable is expected to provide a properly functioning public clone method.
 * *
 * If every field contains a primitive value or a reference to an immutable object, the returned object may be exactly what you need,
 * in which case no further processing is necessary. This is the case, for example, for the @see {@link chapter03.item11.PhoneNumber}.
 */
package chapter03.item11;