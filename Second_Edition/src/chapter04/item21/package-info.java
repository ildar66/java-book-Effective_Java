/**
 * Item 21: Use function objects to represent strategies.
 * *
 * @see chapter04.item21.StringLengthComparator instance is a concrete strategy for string comparison.
 * *
 * In @see {@link chapter04.item21.Host}, a static member class is used in preference to an anonymous class
 * to allow the concrete strategy class to implement a second interface, Serializable.
 * *
 * The {@link java.lang.String} class uses this pattern to export a case-independent string comparator
 * via its CASE_INSENSITIVE_ORDER field.
 * *
 * To summarize, a primary use of function pointers is to implement the Strategy pattern.
 * To implement this pattern in Java, declare an interface to represent the strategy,
 * and a class that implements this interface for each concrete strategy.
 * When a concrete strategy is used only once, it is typically declared and instantiated as an anonymous class.
 * When a concrete strategy is designed for repeated use, it is generally implemented as a private static member class
 * and exported in a public static final field whose type is the strategy interface.
 */

package chapter04.item21;

/*
    //Concrete strategy classes are often declared using anonymous classes
    Arrays.sort(stringArray, new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    });
 */
