/**
 * Item 40: Design method signatures carefully.
 * *
 * Choose method names carefully.
 * Names should always obey the standard naming conventions (Item 56).
 * *
 * Don’t go overboard in providing convenience methods.
 * Too many methods make a class difficult to learn, use, document, test, and maintain.
 * *
 * Avoid long parameter lists. Long sequences of identically typed parameters are especially harmful.
 * There are three techniques for shortening overly long parameter lists:
 * 1) One is to break the method up into multiple methods, each of which requires only a subset of the parameters.
 * 2) A second technique for shortening long parameter lists is to create helper classes to hold groups of parameters.
 * 3) A third technique that combines aspects of the first two is to adapt the Builder pattern ({@link chapter02.item02.builder})
 * from object construction to method invocation. Once the desired parameters have been set, the client invokes the object’s “execute” method,
 * which does any final validity checks on the parameters and performs the actual computation.
 * *
 * For parameter types, favor interfaces over classes.
 * *
 * Prefer two-element enum types to boolean parameters.
 * For example, you might have a Thermometer type with a static factory that takes a value of this enum:
 * // public enum TemperatureScale { FAHRENHEIT, CELSIUS }
 * Not only does Thermometer.newInstance(TemperatureScale.CELSIUS) make a lot more sense than Thermometer.newInstance(true),
 * but you can add KELVIN to TemperatureScale in a future release without having to add a new static factory to Thermometer.
 */
package chapter07.item40;