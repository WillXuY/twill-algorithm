package org.willxu.algorithm.domain.integer;

/**
 * Design an algorithm that accepts a stream of integers and retrieves
 * the product of the last k integers of the stream.
 * <p>
 * Implement the ProductOfNumbers class:
 * <p>
 * ProductOfNumbers() Initializes the object with an empty stream.
 * <p>
 * The test cases are generated so that, at any time, the product of any
 * contiguous sequence of numbers will fit into a single 32-bit integer
 * without overflowing.
 * <p>
 * At most 4 * 10^4 calls will be made to add and getProduct.
 * <p>
 * The product of the stream at any point in time will fit in a 32-bit
 * integer.
 */
public interface ProductOfTheLastNumbers {
    /**
     * Appends the integer num to the stream.
     *
     * @param num 0 <= num <= 100
     */
    void add(int num);

    /**
     * Returns the product of the last k numbers in the current list.
     * You can assume that always the current list has at least k
     * numbers.
     *
     * @param k 1 <= k <= 4 * 10^4
     */
    int getProduct(int k);
}
