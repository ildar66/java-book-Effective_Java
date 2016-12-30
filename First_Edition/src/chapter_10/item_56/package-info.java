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
 * *
 * To summarize, any time you write a readObject method, adopt the mind-set that you are writing a public constructor that must produce
 * a valid instance regardless of what byte stream it is given. Do not assume that the byte stream represents an actual serialized instance.
 * While the examples in this item concern a class that uses the default serialized form, all of the issues that were raised apply equally
 * to classes with custom serialized forms.
 * *
 * Here, in summary form, are the guidelines for writing a bulletproof readObject method:
 * • For classes with object reference fields that must remain private, defensively copy each object that is to be stored in such a field.
 * Mutable components of immutable classes fall into this category.
 * • For classes with invariants, check invariants and throw an InvalidObjectException if a check fails.
 * The checks should follow any defensive copying.
 * • If an entire object graph must be validated after it is deserialized, the ObjectInputValidation interface should be used.
 * • Do not invoke any overridable methods in the class, directly or indirectly.
 * The readResolve method may be used as an alternative to a defensive readObject method. This alternative is discussed in Item 57.
 */
package chapter_10.item_56;