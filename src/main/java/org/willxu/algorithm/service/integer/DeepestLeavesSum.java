package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface DeepestLeavesSum {
    /**
     * Given the root of a binary tree, return the sum of values of its
     * deepest leaves.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             1 <= Node.val <= 100
     */
    int deepestLeavesSum(TreeNode root);
}
