package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface InsufficientNodesInRootToLeafPaths {
    /**
     * Given the root of a binary tree and an integer limit, delete all
     * insufficient nodes in the tree simultaneously, and return the
     * root of the resulting binary tree.
     * <p>
     * A node is insufficient if every root to leaf path intersecting
     * this node has a sum strictly less than limit.
     * <p>
     * A leaf is a node with no children.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 5000].
     *             -10^5 <= Node.val <= 10^5
     * @param limit -10^9 <= limit <= 10^9
     */
    TreeNode sufficientSubset(TreeNode root, int limit);
}
