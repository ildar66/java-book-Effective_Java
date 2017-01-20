/**
 * Item 48: Avoid float and double if exact answers are required.
 * *
 * The float and double types are particularly illsuited for monetary calculations because it is impossible to represent 0.1
 * (or any other negative power of ten) as a float or double exactly. {@link chapter08.item48.Arithmetic#main(java.lang.String[])}
 * *
 * Broken - uses floating point for monetary calculation! {@link chapter08.item48.Arithmetic#howManyCandies1()}
 * use BigDecimal {@link chapter08.item48.Arithmetic#howManyCandies2()},
 * int, or long for monetary calculations {@link chapter08.item48.Arithmetic#howManyCandies3()}.
 * *
 * In summary, don’t use float or double for any calculations that require an exact answer.
 * Use BigDecimal if you want the system to keep track of the decimal point
 * and you don’t mind the inconvenience and cost of not using a primitive type.
 * Using BigDecimal has the added advantage that it gives you full control over rounding,
 * letting you select from eight rounding modes whenever an operation that entails rounding is performed.
 * This comes in handy if you’re performing business calculations with legally mandated rounding behavior.
 * *
 * If performance is of the essence, you don’t mind keeping track of the decimal point yourself,
 * and the quantities aren’t too big, use int or long.
 * If the quantities don’t exceed nine decimal digits, you can use int;
 * if they don’t exceed eighteen digits, you can use long.
 * If the quantities might exceed eighteen digits, you must use BigDecimal.
 */
package chapter08.item48;