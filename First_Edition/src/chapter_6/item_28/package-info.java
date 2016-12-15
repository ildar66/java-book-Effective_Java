/**
 * Item 28: Write doc comments for all exposed API elements.
 *
 * To document your API properly, you must precede every exported class, interface, constructor, method, and field declaration with a doc comment.
 *
 * The doc comment for a method should describe succinctly the contract between the method and its client.
 *
 * To summarize, documentation comments are the best, most effective way to document your API.
 * Their use should be considered mandatory for all exported API elements.
 * Adopt a consistent style adhering to standard conventions.
 * Remember that arbitrary HTML is permissible within documentation comments and that HTML metacharacters must be escaped.
 */

/**
 * Returns the element at the specified position in this list.
 *
 * @param index index of element to return; must be non-negative and less than the size of this list.
 *
 * @return the element at the specified position in this list.
 * @throws IndexOutOfBoundsException if the index is out of range (<tt>index &lt; 0 || index &gt;= this.size()</tt>).
 */
// Object get(int index)
package chapter_6.item_28;