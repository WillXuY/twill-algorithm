package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface CountGoodNodesInBinaryTree {
    /**
     * Given a binary tree root, a node X in the tree is named good if
     * in the path from root to X there are no nodes with a value
     * greater than X.
     * <p>
     * Return the number of good nodes in the binary tree.
     *
     * @param root The number of nodes in the binary tree is in the
     *             range [1, 10^5].
     *             Each node's value is between [-10^4, 10^4].
     */
    int goodNodes(TreeNode root);
}
