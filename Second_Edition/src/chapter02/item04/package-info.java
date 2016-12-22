/**
 * Item 4: Enforce noninstantiability with a private constructor.
 * *
 * Attempting to enforce noninstantiability by making a class abstract does not work. The class can be subclassed and the subclass instantiated.
 * Furthermore, it misleads the user into thinking the class was designed for inheritance.
 * *
 * A default constructor is generated only if a class contains no explicit constructors,
 * so a class can be made noninstantiable by including a private constructor see {@link chapter02.item04.UtilityClass}
 */
package chapter02.item04;