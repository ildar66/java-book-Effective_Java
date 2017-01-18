package chapter08.item45;

/**
 * Sample to item 45.
 */
public class Sample {
    /*// Preferred idiom for iterating over a collection
    for (Element e : c) {
        doSomething(e);
    }*/

/*    // Before release 1.5, this was the preferred idiom (and it still has valid uses):
    // No for-each loop or generics before release 1.5
    for (Iterator i = c.iterator(); i.hasNext(); ) {
        doSomething((Element) i.next());
    } */

/*   //To see why these for loops are preferable to a while loop, consider the following
    // code fragment, which contains two while loops and one bug:
    Iterator<Element> i = c.iterator();
    while (i.hasNext()) {
        doSomething(i.next());
    }
    // ...
    Iterator<Element> i2 = c2.iterator();
    while (i.hasNext()) { // BUG!
        doSomethingElse(i2.next());
    }
    // The second loop contains a cut-and-paste error: it initializes a new loop variable, i2,
    //but uses the old one, i, which is, unfortunately, still in scope.*/

/*
    // Here’s how it looks for the traditional for loop:
    for (Iterator<Element> i = c.iterator(); i.hasNext()) {
        doSomething(i.next());
    }
    //...
    // Compile-time error - cannot find symbol i
    for (Iterator<Element> i2 = c2.iterator(); i.hasNext()) {
        doSomething(i2.next());
    }
   */

/*  //The for loop has one more advantage over the while loop: it is shorter, which enhances readability.
    //Here is another loop idiom that minimizes the scope of local variables:
    for (int i = 0, n = expensiveComputation(); i < n; i++) {
        doSomething(i);
    }*/
}
