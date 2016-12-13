/**
 * Item 21: Replace enum constructs with classes.
 * 
 * Because typesafe enum constants are objects, you can put them into collections. For example,
 * suppose you want the Suit class to export an immutable list of the suits in standard order.
 * Merely add these two field declarations to the class:
 * private static final Suit[] PRIVATE_VALUES = { CLUBS, DIAMONDS, HEARTS, SPADES };
 * public static final List VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
 *
 * Unlike the simplest form of the typesafe enum pattern, classes of the ordinal-based form
 * above can be made serializable (Chapter 10) with a little care. It is not sufficient merely to
 * add implements Serializable to the class declaration.
 *
 * You must also provide a readResolve method (Item 57):
 * private Object readResolve() throws ObjectStreamException {
 *      return PRIVATE_VALUES[ordinal]; // Canonicalize
 * }
 */
package chapter_5.item_21;