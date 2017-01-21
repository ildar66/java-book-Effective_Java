/**
 * Item 52: Refer to objects by their interfaces.
 * *
 * If appropriate interface types exist, then parameters, return values, variables, and fields should all be declared using interface types.
 * *
 * // Good - uses interface as type:
 * List<Subscriber> subscribers = new Vector<Subscriber>();
 * *
 * // Bad - uses class as type!
 * Vector<Subscriber> subscribers = new Vector<Subscriber>();
 * *
 * If you get into the habit of using interfaces as types, your program will be much more flexible.
 * For example, the first declaration could be changed to read:
 * List<Subscriber> subscribers = new ArrayList<Subscriber>();
 * *
 * It is entirely appropriate to refer to an object by a class rather than an interface if no appropriate interface exists.
 * *
 * In practice, it should be apparent whether a given object has an appropriate interface.
 * If it does, your program will be more flexible if you use the interface to refer to the object;
 * if not, just use the least specific class in the class hierarchy that provides the required functionality.
 */
package chapter08.item52;