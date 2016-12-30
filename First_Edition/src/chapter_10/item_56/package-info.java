/**
 * Item 56:Write readObject methods defensively.
 * *
 * Because the physical representation of a @see {@link chapter_10.item_56.Period} object exactly mirrors its logical data content,
 * it is not unreasonable to use the default serialized form (Item 55). Therefore, it might seem that all you have to do to make the class
 * serializable is to add the words “implements Serializable” to the class declaration.
 * If you did so, however, the class would no longer guarantee its critical invariants. @see {@link chapter_10.item_56.BogusPeriod}
 * *
 * It is possible to create a mutable Period instance by fabricating a byte stream that begins with a byte stream representing
 * a valid Period instance and then appends extra references to the private Date fields internal to the Period instance.
 * To see the attack in action, run the following program: @see {@link chapter_10.item_56.MutablePeriod}
 */
package chapter_10.item_56;