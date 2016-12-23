package chapter_9.item_49;

/**
 * For example, the following subclass prints out each work item,
 * printing no more than one item per second, no matter how frequently items are enqueued:.
 */
class DisplayQueue extends WorkQueue {

    protected void processItem(Object workItem)
            throws InterruptedException {
        System.out.println(workItem);
        Thread.sleep(1000);
    }
}
