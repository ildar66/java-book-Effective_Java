/**
 * Item 77: For instance control, prefer enum types to readResolve.
 * *
 * If you depend on readResolve for instance control (see {@link chapter11.item77.Elvis}),
 * all instance fields with object reference types must be declared transient.
 * @see chapter11.item77.ElvisStealer and {@link chapter11.item77.ElvisImpersonator}.
 * *
 */
package chapter11.item77;