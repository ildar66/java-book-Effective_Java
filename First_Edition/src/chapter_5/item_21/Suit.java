package chapter_5.item_21;

// The typesafe enum pattern
public class Suit {

    private final String name;

    private Suit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public static final Suit CLUBS = new Suit("clubs");
    public static final Suit DIAMONDS = new Suit("diamonds");
    public static final Suit HEARTS = new Suit("hearts");
    public static final Suit SPADES = new Suit("spades");
}
