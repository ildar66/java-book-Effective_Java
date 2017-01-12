/**
 * Item 35: Prefer annotations to naming patterns.
 * *
 * Marker annotation type declaration: {@link chapter06.item35.Test}.
 * Program containing marker annotations: {@link chapter06.item35.Sample}.
 * Program to process marker annotations: {@link chapter06.item35.RunTests}
 * *
 * Annotation type with an array parameter: {@link chapter06.item35.ExceptionTest}.
 * Program containing annotations with a parameter: {@link chapter06.item35.Sample2}.
 * Program to process marker annotations with a parameter: {@link chapter06.item35.RunTests2}
 * *
 * There is simply no reason to use naming patterns(all test for example, start with "test...") now that we have annotations.
 * *
 * That said, with the exception of toolsmiths, most programmers will have no need to define annotation types.
 * All programmers should, however, use the predefined annotation types provided by the Java platform (Items 36 and Item 24).
 * Also, consider using any annotations provided by your IDE or static analysis tools.
 * Such annotations can improve the quality of the diagnostic information provided by these tools.
 * Note, however, that these annotations have yet to be standardized, so you will have some work to do
 * if you switch tools, or if a standard emerges.
 */
package chapter06.item35;