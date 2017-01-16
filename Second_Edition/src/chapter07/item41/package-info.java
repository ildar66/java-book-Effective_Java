/**
 * Item 41: Use overloading judiciously.
 * *
 * @see chapter07.item41.CollectionClassifier
 * Because the classify method is overloaded, and the choice of which overloading to invoke is made at compile time.
 * *
 * Selection among overloaded methods is static, while selection among overridden methods is dynamic. {@link chapter07.item41.Overriding}.
 * *
 * You should avoid confusing uses of overloading.
 * A safe, conservative policy is never to export two overloadings with the same number of parameters. {@link chapter07.item41.SetList}.
 * *
 * To summarize, just because you can overload methods doesn’t mean you should.
 * You should generally refrain from overloading methods with multiple signatures that have the same number of parameters.
 * In some cases, especially where constructors are involved, it may be impossible to follow this advice. In that case,
 * you should at least avoid situations where the same set of parameters can be passed to different overloadings by the addition of casts.
 * If such a situation cannot be avoided, for example, because you are retrofitting an existing class to implementa new interface,
 * you should ensure that all overloadings behave identically when passed the same parameters. If you fail to do this, programmers will be hard
 * pressed to make effective use of the overloaded method or constructor, and they won’t understand why it doesn’t work.
 */
package chapter07.item41;