package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface SmallestSubtreeWithAllTheDeepestNodes {
    /**
     * Given the root of a binary tree, the depth of each node is the
     * shortest distance to the root.
     * <p>
     * Return the smallest subtree such that it contains all the deepest
     * nodes in the original tree.
     * <p>
     * A node is called the deepest if it has the largest depth possible
     * among any node in the entire tree.
     * <p>
     * The subtree of a node is a tree consisting of that node, plus the
     * set of all descendants of that node.
     *
     * @param root The number of nodes in the tree will be in the range
     *             [1, 500].
     *             0 <= Node.val <= 500
     *             The values of the nodes in the tree are unique.
     */
    TreeNode subtreeWithAllDeepest(TreeNode root);
}
