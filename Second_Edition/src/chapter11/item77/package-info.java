/**
 * Item 77: For instance control, prefer enum types to readResolve.
 * *
 * If you depend on readResolve for instance control (see {@link chapter11.item77.Elvis}),
 * all instance fields with object reference types must be declared transient.
 * @see chapter11.item77.ElvisStealer and {@link chapter11.item77.ElvisImpersonator}.
 * *
 * Enum singleton - the preferred approach: {@link chapter11.item77.enumSingleton.Elvis}
 * *
 * The accessibility of readResolve is significant.
 * If you place a readResolve method on a final class, it should be private.
 * If you place a readResolve method on a nonfinal class, you must carefully consider its accessibility.
 * If it is private, it will not apply to any subclasses.
 * If it is package-private, it will apply only to subclasses in the same package.
 * If it is protected or public, it will apply to all subclasses that do not override it.
 * If a readResolve method is protected or public and a subclass does not override it,
 * deserializing a serialized subclass instance will produce a superclass instance, which is likely to cause a ClassCastException.
 * *
 * To summarize, you should use enum types to enforce instance control invariants wherever possible.
 * If this is not possible and you need a class to be both serializable and instance-controlled,
 * you must provide a readResolve method and ensure that all of the class’s instance fields are either primitive or transient.
 */
package chapter11.item77;