package chapter07.item44;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * The doc comment for a method should describe succinctly the contract between the method and its client.
 * @param <E> description here.
 */
interface SampleDoc<E> {

    /**
     * Returns the element at the specified position in this list.
     * <p>This method is <i>not</i> guaranteed to run in constant time.
     * In some implementations it may run in time proportional to the element position.
     * @param index index of element to return; must be non-negative and less than the size of this list
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     * ({@code index < 0 || index >= this.size()})
     */
    E get(int index);
    // ... // Remainder omitted
}

/**
 * A college degree, such as B.S., {@literal M.S.} or Ph.D.
 * College is a fountain of knowledge where many go to drink.
 */
// Be careful if the intended summary description contains a period, because the period can prematurely terminate the description.
class Degree {
    // ...
}

/**
 * An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
 * (Remainder omitted)
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
interface Map<K, V> {
    // ... // Remainder omitted
}

/**
 * An instrument section of a symphony orchestra.
 */
enum OrchestraSection {
    /** Woodwinds, such as flute, clarinet, and oboe. */
    WOODWIND,
    /** Brass instruments, such as french horn and trumpet. */
    BRASS,
    /** Percussion instruments, such as timpani and cymbals */
    PERCUSSION,
    /** Stringed instruments, such as violin and cello. */
    STRING
}

/**
 * Indicates that the annotated method is a test method that must throw the designated exception to succeed.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ExceptionTest {

    /**
     * The exception that the annotated test method must throw in order to pass.
     * (The test is permitted to throw any subtype of the type described by this class object.)
     */
    Class<? extends Exception> value();
}