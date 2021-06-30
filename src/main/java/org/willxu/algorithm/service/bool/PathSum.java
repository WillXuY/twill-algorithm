package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface PathSum {
    /**
     * Given the root of a binary tree and an integer targetSum, return
     * true if the tree has a root-to-leaf path such that adding up all
     * the values along the path equals targetSum.
     *
     * A leaf is a node with no children.
     *
     * @param root 0 <= root.size <= 5000
     *             -1000 <= Node.val <= 1000
     * @param targetSum -1000 <= targetSum <= 1000
     * @return has or not
     */
    boolean hasPathSum(TreeNode root, int targetSum);
}
