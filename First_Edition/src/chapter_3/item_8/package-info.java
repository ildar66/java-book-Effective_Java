/**
 * Created by User on 06.12.2016.
 * Item 8: Always override hashCode when you override equals.
 * You must override hashCode in every class that overrides equals.
 *
    Here is the contract, copied from the java.lang.Object specification:
    • Whenever it is invoked on the same object more than once during an execution of
    an application, the hashCode method must consistently return the same integer,
    provided no information used in equals comparisons on the object is modified. This
    integer need not remain consistent from one execution of an application to another
    execution of the same application.
    • If two objects are equal according to the equals(Object) method, then calling
    the hashCode method on each of the two objects must produce the same integer result.
    • It is not required that if two objects are unequal according to the equals(Object)
    method, then calling the hashCode method on each of the two objects must produce
    distinct integer results. However, the programmer should be aware that producing
    distinct integer results for unequal objects may improve the performance of hash
    tables.
 *
 * The key provision that is violated when you fail to override hashCodeis the second one:
    Equal objects must have equal hash codes.
 * Do not be tempted to exclude significant parts of an object from the hash code computation to improve performance.
 */
/*
    A good hash function tends to produce unequal hash codes for unequal objects.
    Here is a simple recipe:
        1. Store some constant nonzero value, say 17, in an int variable called result.
        2. For each significant field f in your object (each field taken into account by the equals method, that is), do the following:
            a. Compute an int hash code c for the field:
                i. If the field is a boolean, compute (f ? 0 : 1).
                ii. If the field is a byte, char, short, or int, compute (int)f.
                iii. If the field is a long, compute (int)(f ^ (f >>> 32)).
                iv. If the field is a float compute Float.floatToIntBits(f).
                v. If the field is a double, compute Double.doubleToLongBits(f), and
                    then hash the resulting long as in step 2.a.iii.
                vi. If the field is an object reference and this class's equals method
                    compares the field by recursively invoking equals, recursively invoke
                    hashCode on the field. If a more complex comparison is required,
                    compute a “canonical representation” for this field and invoke
                    hashCode on the canonical representation. If the value of the field is
                    null, return 0 (or some other constant, but 0 is traditional).
                vii. If the field is an array, treat it as if each element were a separate field.
                    That is, compute a hash code for each significant element by applying
                    these rules recursively, and combine these values as described in step 2.b.
            b. Combine the hash code c computed in step a into result as follows:
                result = 37*result + c;
        3. Return result.
        4. When you are done writing the hashCode method, ask yourself whether equal instances have equal hash codes.
           If not, figure out why and fix the problem.
 */
package chapter_3.item_8;