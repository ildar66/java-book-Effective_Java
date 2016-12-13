/**
 * Item 21: Replace enum constructs with classes.
 * 
 * In summary, the advantages of typesafe enums over int enums are great, and none of the
 * disadvantages seem compelling unless an enumerated type is to be used primarily as a set
 * element or in a severely resource constrained environment. Thus the typesafe enum pattern
 * should be what comes to mind when circumstances call for an enumerated type. APIs
 * that use typesafe enums are far more programmer friendly than those that use int enums.
 * The only reason that typesafe enums are not used more heavily in the Java platform APIs is
 * that the typesafe enum pattern was unknown when many of those APIs were written. Finally,
 * it's worth reiterating that the need for enumerated types of any sort should be relatively rare,
 * as a major use of these types has been made obsolete by subclassing (Item 20).
 */
package chapter_5.item_21;