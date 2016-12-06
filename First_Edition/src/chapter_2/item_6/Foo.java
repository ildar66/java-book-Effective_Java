package chapter_2.item_6;

// Finalizer Guardian idiom
public class Foo {

    // Sole purpose of this object is to finalize outer Foo object
    private final Object finalizerGuardian = new Object() {

        protected void finalize() throws Throwable {
            // Finalize outer Foo object
            //...
        }
    };
    //... // Remainder omitted
}