/**
 * Item 3: Enforce the singleton property with a private constructor or an enum type.
 * *
 * Before release 1.5, there were two ways to implement singletons:
 * In one approach, the member is a final field: see {@link chapter02.item03.field.Elvis}
 * In the second approach to implementing singletons, the public member is a static factory method: see {@link chapter02.item03.method.Elvis}
 * *
 * Each time a serialized instance is deserialized, a new instance will be created.
 * To prevent this, add readResolve method see {@link chapter02.item03.serializable.Elvis}.
 */
package chapter02.item03;