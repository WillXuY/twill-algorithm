package org.willxu.algorithm.domain;

import java.util.Iterator;

/**
 * You are given a nested list of integers nestedList. Each element is
 * either an integer or a list whose elements may also be integers or
 * other lists. Implement an iterator to flatten it.
 * <p>
 * Implement the NestedIterator class:
 * <p>
 * - NestedIterator(List<NestedInteger> nestedList) Initializes the
 *   iterator with the nested list nestedList.
 * <p>
 * Your code will be tested with the following pseudocode:
 * <p>
 * initialize iterator with nestedList
 * res = []
 * while iterator.hasNext()
 *     append iterator.next() to the end of res
 * return res
 * <p>
 * If res matches the expected flattened list, then your code will be
 * judged as correct.
 * <p>
 * 1 <= nestedList.length <= 500
 * The values of the integers in the nested list is in the range
 * [-10^6, 10^6].
 */
public interface FlattenNestedListIterator extends Iterator<Integer> {
    /**
     * @return the next integer in the nested list.
     */
    @Override
    Integer next();

    /**
     * @return true if there are still some integers in the nested list
     *         and false otherwise.
     */
    @Override
    boolean hasNext();
}
