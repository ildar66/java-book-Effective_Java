// Using an EnumMap to associate data with an enum - Pages 161-162
package chapter06.item33;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Simplistic class representing a culinary herb - Page 161
public class Herb {

    public enum Type {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;
    private final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Herb[] garden = {new Herb("Basil", Type.ANNUAL),
                         new Herb("Carroway", Type.BIENNIAL),
                         new Herb("Dill", Type.ANNUAL),
                         new Herb("Lavendar", Type.PERENNIAL),
                         new Herb("Parsley", Type.BIENNIAL),
                         new Herb("Rosemary", Type.PERENNIAL)};

/*        // Using ordinal() to index an array - DON'T DO THIS!
        Set<Herb>[] herbsByType = (Set<Herb>[]) new Set[Herb.Type.values().length]; // Indexed by Herb.Type.ordinal()
        for (int i = 0; i < herbsByType.length; i++)
            herbsByType[i] = new HashSet<Herb>();
        for (Herb h : garden)
            herbsByType[h.type.ordinal()].add(h);
        // Print the results
        for (int i = 0; i < herbsByType.length; i++) {
            System.out.printf("%s: %s%n", Herb.Type.values()[i], herbsByType[i]);
        }*/

        // Using an EnumMap to associate data with an enum - Page 162
        Map<Type, Set<Herb>> herbsByType = new EnumMap<Type, Set<Herb>>(Type.class);
        for (Type t : Type.values())
            herbsByType.put(t, new HashSet<Herb>());
        for (Herb h : garden)
            herbsByType.get(h.type).add(h);
        /* for (Herb h : garden) {
            herbsByType.putIfAbsent(h.type, new HashSet<Herb>());
            herbsByType.get(h.type).add(h);
        }*/
        System.out.println(herbsByType);
    }
}
