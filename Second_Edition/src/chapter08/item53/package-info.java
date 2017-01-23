/**
 * Item 53: Prefer interfaces to reflection.
 * *
 * Reflection allows one class to use another, even if the latter class did not exist when the former was compiled.
 * This power, however, comes at a price:
 * • You lose all the benefits of compile-time type checking.
 * • The code required to perform reflective access is clumsy and verbose.
 * • Performance suffers.
 * *
 * The core reflection facility was originally designed for component-based application builder tools.
 * As a rule, objects should not be accessed reflectively in normal applications at runtime.
 * *
 * You can obtain many of the benefits of reflection while incurring few of its costs by using it only in a very limited form.
 * You can create instances reflectively and access them normally via their interface or superclass: {@link chapter08.item53.MakeSet}.
 */
package chapter08.item53;