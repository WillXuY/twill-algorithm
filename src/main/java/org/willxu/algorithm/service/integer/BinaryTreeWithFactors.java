package org.willxu.algorithm.service.integer;

public interface BinaryTreeWithFactors {
    /**
     * Given an array of unique integers, arr, where each integer arr[i]
     * is strictly greater than 1.
     * <p>
     * We make a binary tree using these integers, and each number may
     * be used for any number of times. Each non-leaf node's value
     * should be equal to the product of the values of its children.
     * <p>
     * Return the number of binary trees we can make. The answer may be
     * too large so return the answer modulo 10^9 + 7.
     *
     * @param arr 1 <= arr.length <= 1000
     *            2 <= arr[i] <= 10^9
     *            All the values of arr are unique.
     */
    int numFactoredBinaryTrees(int[] arr);
}
