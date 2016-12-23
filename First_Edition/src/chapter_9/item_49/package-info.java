/**
 * Item 49: Avoid excessive synchronization.
 * *
 * To avoid the risk of deadlock, never cede control to the client within a synchronized method or block.
 * *
 * As a rule, you should do as little work as possible inside synchronized regions.
 * see {@link chapter_9.item_49.WorkQueue} commented "Open call".
 */
package chapter_9.item_49;