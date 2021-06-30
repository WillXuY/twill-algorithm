package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MinimumDepthOrBinaryTree {
    /**
     * Given a binary tree, find its minimum depth.
     *
     * The minimum depth is the number of nodes along the shortest path
     * from the root node down to the nearest leaf node.
     *
     * Note:
     * A leaf is a node with no children.
     *
     * @param root 0 <= root.size <= 10^5
     *             -1000 <= Node.val <= 1000
     * @return min depth
     */
    int minDepth(TreeNode root);
}
