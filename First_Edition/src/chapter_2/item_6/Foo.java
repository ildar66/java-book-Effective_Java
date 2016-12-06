package chapter_2.item_6;

// Finalizer Guardian idiom

/**
 * In summary, don't use finalizers except as a safety net or to terminate noncritical native
 * resources. In those rare instances where you do use a finalizer, remember to invoke
 * super.finalize. Last , if you need to associate a finalizer with a public, nonfinal class,
 * consider using a finalizer guardian to ensure that the finalizer is executed, even if a subclass
 * finalizer fails to invoke super.finalize.
 */
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