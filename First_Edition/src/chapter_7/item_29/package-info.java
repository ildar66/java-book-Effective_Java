/**
 * Item 29: Minimize the scope of local variables.
 *
 * The most powerful technique for minimizing the scope of a local variable is to declare it where it is first used.
 *
 * Nearly every local variable declaration should contain an initializer(One exception to this rule concerns try-catch statements).
 *
 * A final technique to minimize the scope of local variables is to keep methods small and focused.
 * If you combine two activities in the same method, local variables relevant to one activity may be in the scope of the code
 * performing the other activity. To prevent this from happening, simply separate the method into two: one for each activity.
 */
package chapter_7.item_29;