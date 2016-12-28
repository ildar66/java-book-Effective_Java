/**
 * Item 14: In public classes, use accessor methods, not public fields.
 * *
 * Hard-line object-oriented programmers feel that such classes are anathema and should always be replaced by classes with private fields
 * and public accessor methods (getters) and, for mutable classes, mutators (setters): @see {@link chapter04.item14.Point}
 * *
 * If a class is accessible outside its package, provide accessor methods.
 * If a class is package-private or is a private nested class, there is nothing inherently wrong with exposing its data fields.
 * *
 * While it’s never a good idea for a public class to expose fields directly, it is less harmful if the fields are immutable.
 * @see chapter04.item14.Time
 * You can’t change the representation of such a class without changing its API.
 * *
 * In summary, public classes should never expose mutable fields.
 * It is less harmful, though still questionable, for public classes to expose immutable fields.
 * It is, however, sometimes desirable for package-private or private nested classes to expose fields, whether mutable or immutable.
 */
package chapter04.item14;