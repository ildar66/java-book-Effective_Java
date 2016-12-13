package chapter_5.item_21;

// Ordinal-based typesafe enum
public class Suit2 implements Comparable {

    private final String name;
    // Ordinal of next suit to be created
    private static int nextOrdinal = 0;
    // Assign an ordinal to this suit
    private final int ordinal = nextOrdinal++;

    private Suit2(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Object o) {
        return ordinal - ((Suit2) o).ordinal;
    }

    public static final Suit2 CLUBS = new Suit2("clubs");
    public static final Suit2 DIAMONDS = new Suit2("diamonds");
    public static final Suit2 HEARTS = new Suit2("hearts");
    public static final Suit2 SPADES = new Suit2("spades");
    
    /**
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

}
