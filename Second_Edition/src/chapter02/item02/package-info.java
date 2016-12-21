/**
 * Item 2: Consider a builder when faced with many constructor parameters.
 * *
 * The telescoping constructor pattern works see {@link chapter02.item02.telescopingconstructor.NutritionFacts},
 * but it is hard to write client code when there are many parameters, and harder still to read it.
 * *
 * JavaBeans pattern has serious disadvantages of its own see {@link chapter02.item02.javabeans.NutritionFacts}.
 * Because construction is split across multiple calls, a JavaBean may be in an inconsistent state partway through its construction.
 * A related disadvantage is that the JavaBeans pattern precludes the possibility of making a class immutable.
 * *
 */
package chapter02.item02;