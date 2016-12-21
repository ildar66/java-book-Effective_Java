/**
 * Item 3: Enforce the singleton property with a private constructor or an enum type.
 * *
 * Before release 1.5, there were two ways to implement singletons:
 * In one approach, the member is a final field: see {@link chapter02.item03.field.Elvis}
 * In the second approach to implementing singletons, the public member is a static factory method: see {@link chapter02.item03.method.Elvis}
 * *
 * Each time a serialized instance is deserialized, a new instance will be created.
 * To prevent this, add readResolve method see {@link chapter02.item03.serializable.Elvis}.
 * *
 * As of release 1.5, there is a third approach to implementing singletons.
 * Simply make an enum type with one element: see {@link chapter02.item03.enumeration.Elvis}
 * This approach is functionally equivalent to the public field approach, except that it is more concise,
 * provides the serialization machinery for free,
 * and provides an ironclad guarantee against multiple instantiation, even in the face of sophisticated serialization or reflection attacks.
 */
package chapter02.item03;