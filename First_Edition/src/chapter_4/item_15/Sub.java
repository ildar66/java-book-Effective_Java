package chapter_4.item_15;

import java.util.Date;

/**
 * You might expect this program to print out the date twice, but it prints out null the first time
 * because the method m is invoked by the constructor Super() before the constructor Sub() has
 * a chance to initialize the date field. Note that this program observes a final field in two different states.
 */
//Here's a subclass that overrides m, which is erroneously invoked by Super's sole constructor:
final class Sub extends Super {

    private final Date date; // Blank final, set by constructor

    Sub() {
        date = new Date();
    }

    // Overrides Super.m, invoked by the constructor Super()
    public void m() {
        System.out.println(date);
    }

    public static void main(String[] args) {
        Sub s = new Sub();
        s.m();
    }
}
