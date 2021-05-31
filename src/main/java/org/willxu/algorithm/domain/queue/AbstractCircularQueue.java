package org.willxu.algorithm.domain.queue;

public abstract class AbstractCircularQueue {
    protected int size;
    protected final int MAX_SIZE;

    /**
     * Initialize your data structure here. Set the size of the queue
     * to be k.
     * @param k final max size of this circular queue
     */
    protected AbstractCircularQueue(int k) {
        MAX_SIZE = k;
        size = 0;
    }

    /**
     * Gets the front item from the queue.
     * If the queue is empty, return -1.
     * @return the front item
     */
    public abstract int front();

    /**
     * Gets the last item from the queue.
     * If the queue is empty, return -1.
     * @return the last item
     */
    public abstract int rear();

    /**
     * Insert an element into the circular queue.
     * Return true if the operation is successful.
     * @param value an element
     * @return is the operation is successful
     */
    public abstract boolean enQueue(int value);

    /**
     * Delete an element from the circular queue.
     * Return true if the operation is successful.
     * @return is the operation successful
     */
    public abstract boolean deQueue();

    /**
     * Checks whether the circular queue is empty or not.
     * @return is empty
     */
    public abstract boolean isEmpty();

    /**
     * Checks whether the circular queue is full or not.
     * @return is full
     */
    public abstract boolean isFull();
}
