/**
 * Item 44: Write doc comments for all exposed API elements.
 * *
 * To document your API properly, you must precede every exported class, interface, constructor, method, and field declaration with a doc comment.
 * *
 * The doc comment for a method should describe succinctly the contract between the method and its client:
 * Preconditions are described implicitly by the @throws tags for unchecked exceptions;
 * each unchecked exception corresponds to a precondition violation.
 * Also, preconditions can be specified along with the affected parameters in their @param tags.
 * In addition to preconditions and postconditions, methods should document any side effects (For example, if a method starts a background thread).
 * Finally, documentation comments should describe the thread safety of a class or method, as discussed in Item 70.
 * @see chapter07.item44.SampleDoc
 * *
 * It is no longer necessary to use the HTML <code/> or <tt/> tags in doc comments:
 * the Javadoc {@code} tag is preferable because it eliminates the need to escape HTML metacharacters.
 * *
 * The best way to get characters (<), (>), (@) into documentation is to surround them with the {@literal} tag:
 * * The triangle inequality is {@literal |x + y| < |x| + |y|}.
 * *
 * The first “sentence” of each doc comment (as defined below) becomes the summary description.
 * Summary description ends at the first period that is followed bya space, tab, or line terminator (or at the first block tag).
 * No two members or constructors in a class or interface should have the same summary description.
 * Be careful if the intended summary description contains a period {@link chapter07.item44.Degree}
 * *
 * When documenting a generic type or method, be sure to document all type parameters: {@link chapter07.item44.Map}
 * *
 * When documenting an enum type, be sure to document the constants: {@link chapter07.item44.OrchestraSection}.
 * *
 * When documenting an annotation type, be sure to document any members: {@link chapter07.item44.ExceptionTest}.
 * *
 * To summarize, documentation comments are the best, most effective way to document your API.
 * Their use should be considered mandatory for all exported API elements.
 * Adopt a consistent style that adheres to standard conventions.
 * Remember that arbitrary HTML is permissible within documentation comments and that HTML metacharacters must be escaped.
 */
package chapter07.item44;