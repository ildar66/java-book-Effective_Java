package chapter_6.item_26;

/**
 * The name method is declared in class A and overridden in classes B and C.
 * As you would expect, this program prints out “ABC” even though the compile-time type of the instance is A in each iteration of the loop.
 */
class A {

    String name() {
        return "A";
    }
}

class B extends A {

    String name() {
        return "B";
    }
}

class C extends A {

    String name() {
        return "C";
    }
}

public class Overriding {

    public static void main(String[] args) {
        A[] tests = new A[] {new A(), new B(), new C()};
        for (int i = 0; i < tests.length; i++)
            System.out.print(tests[i].name());
    }
}