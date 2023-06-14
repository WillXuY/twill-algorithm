package org.willxu.algorithm.domain;

import java.util.Iterator;

/**
 * Design an iterator that supports the peek operation on an existing
 * iterator in addition to the hasNext and the next operations.
 * <p>
 * Implement the PeekingIterator class:
 * <p>
 * PeekingIterator(Iterator<int> nums) Initializes the object with the
 * given integer iterator iterator.
 * <p>
 * Note: Each language may have a different implementation of the
 * constructor and Iterator, but they all support the int next() and
 * boolean hasNext() functions.
 * <p>
 * - 1 <= nums.length <= 1000
 * - 1 <= nums[i] <= 1000
 * - All the calls to next and peek are valid.
 * - At most 1000 calls will be made to next, hasNext, and peek.
 *
 */
public interface PeekingIterator extends Iterator<Integer> {
    /**
     * @return the next element in the array without moving the pointer.
     */
    Integer peek();

    /**
     * @return the next element in the array and moves the pointer to
     *         the next element.
     */
    Integer next();

    /**
     * @return true if there are still elements in the array.
     */
    boolean hasNext();
}
