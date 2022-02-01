package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface SumOfRootToLeafBinaryNumbers {
    /**
     * You are given the root of a binary tree where each node has a
     * value 0 or 1. Each root-to-leaf path represents a binary number
     * starting with the most significant bit.
     * - For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this
     *   could represent 01101 in binary, which is 13.
     * For all leaves in the tree, consider the numbers represented by
     * the path from the root to that leaf. Return the sum of these
     * numbers.
     * The test cases are generated so that the answer fits in a 32-bits
     * integer.
     *
     * @param root 1 <= root.size <= 1000
     *             Node.val is 0 or 1.
     * @return sum of root to leaf as binary.
     */
    int sumRootToLeaf(TreeNode root);
}
