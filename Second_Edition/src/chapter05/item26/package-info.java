/**
 * Item 26: Favor generic types.
 * *
 * Object-based collection - a prime candidate for generics: {@link chapter05.item26.Stack}
 * The first solution {@link chapter05.item26.firsttechnqiue.Stack}
 * The second solution {@link chapter05.item26.secondtechnqiue.Stack}
 * *
 * In summary, generic types are safer and easier to use than types that require casts in client code.
 * When you design new types, make sure that they can be used without such casts. This will often mean making the types generic.
 * Generify your existing types as time permits.
 * This will make life easier for new users of these types without breaking existing clients (Item 23).
 */
package chapter05.item26;