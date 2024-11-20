package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MaximumProductOfSplittedBinaryTree {
    /**
     * Given the root of a binary tree, split the binary tree into two
     * subtrees by removing one edge such that the product of the sums
     * of the subtrees is maximized.
     * <p>
     * Return the maximum product of the sums of the two subtrees. Since
     * the answer may be too large, return it modulo 10^9 + 7.
     * <p>
     * Note that you need to maximize the answer before taking the mod
     * and not after taking it.
     *
     * @param root The number of nodes in the tree is in the range
     *             [2, 5 * 10^4].
     *             1 <= Node.val <= 10^4
     */
    int maxProduct(TreeNode root);
}
