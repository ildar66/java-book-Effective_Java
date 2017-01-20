// What does this program do? - Page 222
package chapter08.item49;

public class Unbelievable {

    static Integer i;

    public static void main_0(String[] args) {
        if (i == 42)
            System.out.println("Unbelievable");
    }

    /**
     * This program is much slower than it should be because it accidentally declares a
     * local variable (sum) to be of the boxed primitive type Long instead of the primitive type long.
     */
    // Hideously slow program! Can you spot the object creation?
    public static void main(String[] args) {
        Long sum = 0L; // long sum = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}