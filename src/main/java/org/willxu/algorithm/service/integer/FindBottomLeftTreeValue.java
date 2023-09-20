package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface FindBottomLeftTreeValue {
    /**
     * Given the root of a binary tree, return the leftmost value in the
     * last row of the tree.
     *
     * @param root The number of nodes in the tree is in the range [1, 10^4].
     *             -2^31 <= Node.val <= 2^31 - 1
     */
    int findBottomLeftValue(TreeNode root);
}
