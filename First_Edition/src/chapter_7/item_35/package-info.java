/**
 * Item 35: Prefer interfaces to reflection.
 * Reflection allows one class to use another, even if the latter class did not exist when the former was compiled.
 * This power, however, comes at a price:
 * • You lose all the benefits of compile-time type checking, including exception
 * checking. If a program attempts to invoke a nonexistent or inaccessible method
 * reflectively, it will fail at run time unless you've taken special precautions.
 * • The code required to perform reflective access is clumsy and verbose. It is tedious
 * to write and difficult to read.
 * • Performance suffers. As of release 1.3, reflective method invocation was forty times
 * slower on my machine than normal method invocation. Reflection was rearchitected in
 * release 1.4 for greatly improved performance, but it is still twice as slow as normal
 * access, and the gap is unlikely to narrow.
 * * *
 * As a rule, objects should not be accessed reflectively in normal applications at run time.
 */
package chapter_7.item_35;