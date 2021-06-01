package org.willxu.algorithm.domain.queue;

/**
 * Design your implementation of the circular queue. The circular queue
 * is a linear data structure in which the operations are performed
 * based on FIFO (First In First Out) principle and the last position
 * is connected back to the first position to make a circle. It is also
 * called "Ring Buffer".
 * One of the benefits of the circular queue is that we can make use of
 * the spaces in front of the queue. In a normal queue, once the queue
 * becomes full, we cannot insert the next element even if there is a
 * space in front of the queue. But using the circular queue, we can use
 * the space to store new values.
 *
 * At most 3000 calls will be made to enQueue, deQueue, Front, Rear,
 * isEmpty, and isFull.
 */
public abstract class AbstractCircularQueue {
    /**
     * 1 <= k <= 100.
     */
    protected final int MAX_SIZE;

    /**
     * Initialize your data structure here. Set the size of the queue
     * to be k.
     * @param k final max size of this circular queue
     *          1 <= k <= 1000
     */
    protected AbstractCircularQueue(int k) {
        MAX_SIZE = k;
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
     *              0 <= value <= 1000
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
