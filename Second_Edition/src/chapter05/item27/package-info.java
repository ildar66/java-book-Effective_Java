/**
 * Item 27: Favor generic methods.
 * *
 * The type parameter list, which declares the type parameter, goes between the method’s modifiers and its return type.
 * @see chapter05.item27.Union
 * *
 * Generic static factory method: {@link chapter05.item27.GenericStaticFactory}.
 * *
 * Generic singleton factory pattern: {@link chapter05.item27.GenericSingletonFactory}.
 * *
 * Using a recursive type bound to express mutual comparability: {@link chapter05.item27.RecursiveTypeBound}.
 * *
 * In summary, generic methods, like generic types,
 * are safer and easier to use than methods that require their clients to cast input parameters and return values.
 * Like types, you should make sure that your new methods can be used without casts, which will often mean making them generic.
 * And like types, you should generify your existing methods to make life easier for new users without breaking existing clients (Item 23).
 */
package chapter05.item27;