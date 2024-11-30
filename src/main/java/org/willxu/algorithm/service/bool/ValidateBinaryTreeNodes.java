package org.willxu.algorithm.service.bool;

public interface ValidateBinaryTreeNodes {
    /**
     * You have n binary tree nodes numbered from 0 to n - 1 where node
     * i has two children leftChild[i] and rightChild[i], return true if
     * and only if all the given nodes form exactly one valid binary
     * tree.
     * <p>
     * If node i has no left child then leftChild[i] will equal -1,
     * similarly for the right child.
     * <p>
     * Note that the nodes have no values and that we only use the node
     * numbers in this problem.
     *
     * @param n 1 <= n <= 10^4
     * @param leftChild,rightChild n == leftChild.length == rightChild.length
     *                             -1 <= leftChild[i], rightChild[i] <= n - 1
     */
    boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild);
}
