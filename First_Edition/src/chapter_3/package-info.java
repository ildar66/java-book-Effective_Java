/**
 * Methods Common to All Objects.
 * Although Object is a concrete class, it is designed primarily for extension. All of its nonfinal
 * methods (equals, hashCode, toString, clone, and finalize) have explicit general
 * contracts because they are designed to be overridden. It is the responsibility of any class
 * overriding these methods to obey their general contracts; failure to do so will prevent other
 * classes that depend on these contracts from functioning properly in conjunction with the class.
 * This chapter tells you when and how to override the nonfinal Object methods. The finalize
 * method is omitted from this chapter because it was discussed in Item 6. While not an Object
 * method, Comparable.compareTo is discussed in this chapter because it has a similar
 * character.
 */
package chapter_3;