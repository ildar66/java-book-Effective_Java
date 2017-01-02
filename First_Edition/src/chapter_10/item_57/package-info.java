/**
 * Item 57: Provide a readResolve method when necessary.
 * *
 * A readResolve method is necessary not only for singletons, but for all other instancecontrolled classes.
 * @see chapter_10.item_57.Elvis
 * *
 * A second use for the readResolve method is as a conservative alternative to the defensive readObject method recommended in Item 56.
 * While the defensive readResolve idiom is not widely used, it merits serious consideration.
 * Its major disadvantage is that it is not suitable for classes that permit inheritance outside of their own package.
 * *
 * To summarize, you must use a readResolve method to protect the “instance-control invariants” of singletons and other instance-controlled classes.
 * In essence, the readResolve method turns the readObject method from a de facto public constructor into a de facto public static factory.
 * The readResolve method is also useful as a simple alternative to a defensive readObject method for classes
 * that prohibit inheritance outside their package.
 */
package chapter_10.item_57;