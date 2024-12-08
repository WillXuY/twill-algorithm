package org.willxu.algorithm.domain.integer;

/**
 * Design a stack that supports increment operations on its elements.
 * <p>
 * Implement the CustomStack class:
 * <p>
 * CustomStack(int maxSize) Initializes the object with maxSize which is
 * the maximum number of elements in the stack.
 * <p>
 * At most 1000 calls will be made to each method of increment, push and
 * pop each separately.
 */
public interface DesignStackWithIncrementOperation {
    /**
     * Adds x to the top of the stack if the stack has not reached the
     * maxSize.
     *
     * @param x 1 <=x <= 1000
     */
    void push(int x);

    /**
     * Pops and returns the top of the stack or -1 if the stack is empty.
     */
    int pop();

    /**
     * Increments the bottom k elements of the stack by val. If there
     * are less than k elements in the stack, increment all the elements
     * in the stack.
     *
     * @param k 1 <= k <= 1000
     * @param val 0 <= val <= 100
     */
    void increment(int k, int val);
}
