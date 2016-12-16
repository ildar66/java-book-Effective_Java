/**
 * Item 31: Avoid float and double if exact answers are required.
 * 
 * The float and double types are particularly ill-suited for monetary calculations because it is impossible to represent 0.1
 * (or any other negative power of ten) as a float or double exactly.
 *
 * Use BigDecimal, int, or long for monetary calculations.
 *
 * In summary, don't use float or double for any calculations that require an exact answer. Use
 * BigDecimal if you want the system to keep track of the decimal point and you don't mind the
 * inconvenience of not using a primitive type. Using BigDecimal has the added advantage that
 * it gives you full control over rounding, letting you select from eight rounding modes
 * whenever an operation that entails rounding is performed. This comes in handy if you're
 * performing business calculations with legally mandated rounding behavior. If performance is
 * of the essence, if you don't mind keeping track of the decimal point yourself, and if the
 * quantities aren't too big, use int or long. If the quantities don't exceed nine decimal digits,
 * you can use int; if they don't exceed eighteen digits, you can use long. If the quantities
 * exceed eighteen digits, you must use BigDecimal.
 */
package chapter_7.item_31;