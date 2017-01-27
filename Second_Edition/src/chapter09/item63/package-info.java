/**
 * Item 63: Include failure-capture information in detail messages.
 * *
 * To capture the failure, the detail message of an exception should contain
 * the values of all parameters and fields that “contributed to the exception.”
 * @see chapter09.item63.IndexOutOfBoundsException
 * *
 * As suggested in Item 58, it may be appropriate for an exception to provide accessor methods
 * for its failure-capture information (lowerBound, upperBound, and index in the above example).
 * It is more important to provide such accessor methods on checked exceptions than on unchecked exceptions,
 * because the failure-capture information could be useful in recovering from the failure.
 * It is rare(although not inconceivable) that a programmer might want programmatic access to the details of an unchecked exception.
 * Even for unchecked exceptions, however, it seems advisable to provide these accessors on general principle (Item 10).
 */
package chapter09.item63;