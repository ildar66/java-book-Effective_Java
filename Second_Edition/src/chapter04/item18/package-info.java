/**
 * Item 18: Prefer interfaces to abstract classes.
 * *
 * Existing classes can be easily retrofitted to implement a new interface.
 * *
 * Interfaces are ideal for defining mixins(For example, Comparable).
 * *
 * Interfaces allow the construction of nonhierarchical type frameworks.
 * *
 * Interfaces enable safe, powerful functionality enhancements via the wrapper class idiom, described in Item 16.
 * *
 * You can combine the virtues of interfaces and abstract classes by providing an abstract skeletal implementation class
 * to go with each nontrivial interface that you export. @see {@link chapter04.item18.IntArrays}.
 * *
 * Writing a skeletal implementation is a relatively simple. @see {@link chapter04.item18.AbstractMapEntry}.
 * *
 * It is far easier to evolve an abstract class than an interface.
 * *
 * Once an interface is released and widely implemented, it is almost impossible to change.
 * *
 * To summarize, an interface is generally the best way to define a type that permits multiple implementations.
 * An exception to this rule is the case where ease of evolution is deemed more important than flexibility and power.
 * Under these circumstances, you should use an abstract class to define the type, but only if you understand and can accept the limitations.
 * If you export a nontrivial interface, you should strongly consider providing a skeletal implementation to go with it.
 * Finally, you should design all of your public interfaces with the utmost care and test them thoroughly by writing multiple implementations.
 */
package chapter04.item18;