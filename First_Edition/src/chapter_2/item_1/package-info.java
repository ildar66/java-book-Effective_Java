/**
 * Created by User on 05.12.2016.
 *
 * Item 1: Consider providing static factory methods instead of constructors:
 *
 *   One advantage of static factory methods is that, unlike constructors, they have names.
 *
 *   A second advantage of static factory methods is that, unlike constructors, they are not required to create a new object each time they're invoked.
 *
 *   A third advantage of static factory methods is that, unlike constructors, they can return an object of any subtype of their return type.
 *
 *   The main disadvantage of static factory methods is that classes without public or protected constructors cannot be subclassed.
 *
 *   A second disadvantage of static factory methods is that they are not readily distinguishable from other static methods.
 */
package chapter_2.item_1;