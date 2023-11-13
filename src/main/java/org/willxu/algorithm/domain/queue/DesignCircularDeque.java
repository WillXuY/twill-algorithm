package org.willxu.algorithm.domain.queue;

/**
 * Design your implementation of the circular double-ended queue (deque).
 * <p>
 * Implement the MyCircularDeque class:
 * <p>
 * MyCircularDeque(int k) Initializes the deque with a maximum size of k.
 * <p>
 * 1 <= k <= 1000
 * At most 2000 calls will be made to insertFront, insertLast,
 * deleteFront, deleteLast, getFront, getRear, isEmpty, isFull.
 */
public interface DesignCircularDeque {
    /**
     * Adds an item at the front of Deque.
     *
     * @param value 0 <= value <= 1000
     * @return true if the operation is successful, or false otherwise.
     */
    boolean insertFront(int value);

    /**
     * Adds an item at the rear of Deque.
     *
     * @param value 0 <= value <= 1000
     * @return true if the operation is successful, or false otherwise.
     */
    boolean insertLast(int value);

    /**
     * Deletes an item from the front of Deque.
     *
     * @return true if the operation is successful, or false otherwise.
     */
    boolean deleteFront();

    /**
     * Deletes an item from the rear of Deque.
     *
     * @return true if the operation is successful, or false otherwise.
     */
    boolean deleteLast();

    /**
     * @return the front item from the Deque. Returns -1 if the deque is
     *         empty.
     */
    int getFront();

    /**
     * @return the last item from Deque. Returns -1 if the deque is
     *         empty.
     */
    int getRear();

    /**
     * @return true if the deque is empty, or false otherwise.
     */
    boolean isEmpty();

    /**
     * @return true if the deque is full, or false otherwise.
     */
    boolean isFull();
}
