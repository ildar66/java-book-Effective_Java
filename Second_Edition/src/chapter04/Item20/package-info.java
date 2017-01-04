/**
 * Item 20: Prefer class hierarchies to tagged classes.
 * *
 * Tagged classes are verbose, error-prone, and inefficient. @see {@link chapter04.Item20.taggedclass.Figure}.
 * A tagged class is just a pallid imitation of a class hierarchy.
 * *
 * To transform a tagged class into a class hierarchy, first define an abstract class containing an abstract method
 * for each method in the tagged class whose behavior depends on the tag value: @see {@link chapter04.Item20.hierarchy.Figure}.
 * *
 * Next, define a concrete subclass of the root class for each flavor of the original tagged class.
 * @see chapter04.Item20.hierarchy.Circle and {@link chapter04.Item20.hierarchy.Rectangle}.
 * All fields are final. The compiler ensures that each class’s constructor initializes its data fields,
 * and that each class has an implementation for every abstract method declared in the root class.
 * *
 * Another advantage of class hierarchies is that they can be made to reflect natural hierarchical relationships among types,
 * allowing for increased flexibility and better compile-time type checking. @see {@link chapter04.Item20.hierarchy.Square}.
 * *
 * In summary, tagged classes are seldom appropriate. If you’re tempted to write a class with an explicit tag field,
 * think about whether the tag could be eliminated and the class replaced by a hierarchy.
 * When you encounter an existing class with a tag field, consider refactoring it into a hierarchy.
 */
package chapter04.Item20;