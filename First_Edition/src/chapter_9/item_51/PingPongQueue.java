package chapter_9.item_51;

class PingPongQueue extends WorkQueue {

    volatile int count = 0;

    protected void processItem(final Object sender) {
        count++;
        WorkQueue recipient = (WorkQueue) sender;
        recipient.enqueue(this);
    }
}
