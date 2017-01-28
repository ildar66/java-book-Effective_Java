/**
 * Item 64: Strive for failure atomicity.
 * *
 * Generally speaking, a failed method invocation should leave the object in the state that it was in prior to the invocation.
 * *
 * For methods that operate on mutable objects, the most common way to achieve failure atomicity
 * is to check parameters for validity before performing the operation (Item 38).
 * *
 * A closely related approach to achieving failure atomicity is to order the computation
 * so that any part that may fail takes place before any part that modifies the object.
 * *
 * A third and far less common approach to achieving failure atomicity is to write recovery code that intercepts a failure
 * that occurs in the midst of an operation and causes the object to roll back its state to the point before the operation began.
 * This approach is used mainly for durable (disk-based) data structures.
 * *
 * A final approach to achieving failure atomicity is to perform the operation on a temporary copy of the object
 * and to replace the contents of the object with the temporary copy once the operation is complete.
 * *
 * As a rule,any generated exception that is part of a method’s specification
 * should leave the object in the same state it was in prior to the method invocation.
 * Where this rule is violated, the API documentation should clearly indicate what state the object will be left in.
 */
package chapter09.item64;