package org.willxu.algorithm.service.integer;

public interface MinimumCostTreeFromLeafValues {
    /**
     * Given an array arr of positive integers, consider all binary
     * trees such that:
     * <p>
     * - Each node has either 0 or 2 children;
     * - The values of arr correspond to the values of each leaf in an
     *   in-order traversal of the tree.
     * - The value of each non-leaf node is equal to the product of the
     *   largest leaf value in its left and right subtree, respectively.
     * <p>
     * Among all possible binary trees considered, return the smallest
     * possible sum of the values of each non-leaf node. It is
     * guaranteed this sum fits into a 32-bit integer.
     * <p>
     * A node is a leaf if and only if it has zero children.
     *
     * @param arr 2 <= arr.length <= 40
     *            1 <= arr[i] <= 15
     *            It is guaranteed that the answer fits into a 32-bit
     *            signed integer (i.e., it is less than 2^31).
     */
    int mctFromLeafValues(int[] arr);
}
