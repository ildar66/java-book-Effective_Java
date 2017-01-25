package chapter09.item59;

public class Sample {
    /*  One technique for turning a checked exception into an unchecked exception is
    to break the method that throws the exception into two methods, the first of which
    returns a boolean that indicates whether the exception would be thrown.
    This API refactoring transforms the calling sequence from this:

    // Invocation with checked exception
    try {
        obj.action(args);
    } catch(TheCheckedException e) {
        // Handle exceptional condition
        ...
    }

    to this:

    // Invocation with state-testing method and unchecked exception
    if (obj.actionPermitted(args)) {
        obj.action(args);
    } else {
        // Handle exceptional condition
        ...
    }
    */
}
