/**
 * Item 15: Design and document for inheritance or else prohibit it.
 * Constructors must not invoke overridable methods, directly or indirectly.
 *
 * If a concrete class does not implement a standard interface, then you may inconvenience some
 * programmers by prohibiting inheritance. If you feel that you must allow inheritance from such
 * a class, one reasonable approach is to ensure that the class never invokes any of its
 * overridable methods and to document this fact. In other words, eliminate the class's self-use of
 * overridable methods entirely. In doing so, you'll create a class that is reasonably safe to
 * subclass. Overriding a method will never affect the behavior of any other method.
 * 
 * You can eliminate a class's self-use of overridable methods mechanically, without changing
 * its behavior. Move the body of each overridable method to a private “helper method” and
 * have each overridable method invoke its private helper method. Then replace each self-use of
 * an overridable method with a direct invocation of the overridable method's private helper
 * method.
 */
package chapter_4.item_15;