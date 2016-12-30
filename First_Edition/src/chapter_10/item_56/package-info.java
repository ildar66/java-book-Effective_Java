/**
 * Item 56:Write readObject methods defensively.
 * *
 * Because the physical representation of a @see {@link chapter_10.item_56.Period} object exactly mirrors its logical data content,
 * it is not unreasonable to use the default serialized form (Item 55). Therefore, it might seem that all you have to do to make the class
 * serializable is to add the words “implements Serializable” to the class declaration.
 * If you did so, however, the class would no longer guarantee its critical invariants. @see {@link chapter_10.item_56.BogusPeriod}
 */
package chapter_10.item_56;