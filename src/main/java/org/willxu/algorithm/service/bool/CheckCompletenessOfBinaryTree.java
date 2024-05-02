package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface CheckCompletenessOfBinaryTree {
    /**
     * Given the root of a binary tree, determine if it is a complete
     * binary tree.
     * <p>
     * In a complete binary tree, every level, except possibly the last,
     * is completely filled, and all nodes in the last level are as far
     * left as possible. It can have between 1 and 2h nodes inclusive at
     * the last level h.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 100].
     *             1 <= Node.val <= 1000
     */
    boolean isCompleteTree(TreeNode root);
}
