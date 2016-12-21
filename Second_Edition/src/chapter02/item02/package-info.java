/**
 * Item 2: Consider a builder when faced with many constructor parameters see {@link chapter02.item02.builder.NutritionFacts}.
 * Note that NutritionFacts is immutable, and that all parameter default values are in a single location.
 * *
 * The telescoping constructor pattern works see {@link chapter02.item02.telescopingconstructor.NutritionFacts},
 * but it is hard to write client code when there are many parameters, and harder still to read it.
 * *
 * JavaBeans pattern has serious disadvantages of its own see {@link chapter02.item02.javabeans.NutritionFacts}.
 * Because construction is split across multiple calls, a JavaBean may be in an inconsistent state partway through its construction.
 * A related disadvantage is that the JavaBeans pattern precludes the possibility of making a class immutable.
 * *
 * In summary, the Builder pattern is a good choice when designing classes whose constructors or static factories would have more
 * than a handful of parameters, especially if most of those parameters are optional.
 * Client code is much easier to read and write with builders than with the traditional telescoping constructor pattern,
 * and builders are much safer than JavaBeans.
 */
package chapter02.item02;