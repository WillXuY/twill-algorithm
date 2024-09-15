package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MaximumLevelSumOfBinaryTree {
    /**
     * Given the root of a binary tree, the level of its root is 1, the
     * level of its children is 2, and so on.
     * <p>
     * Return the smallest level x such that the sum of all the values
     * of nodes at level x is maximal.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             -10^5 <= Node.val <= 10^5
     */
    int maxLevelSum(TreeNode root);
}
