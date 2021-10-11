package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface MinimumAbsoluteDifferenceInBst {
    /**
     * Given the root of a Binary Search Tree (BST), return the minimum
     * absolute difference between the values of any two difference
     * nodes in the tree.
     *
     * @param root 2 <= root.size <= 10^4
     *             0 <= Node.val <= 10^5
     * @return the minimum absolute difference.
     */
    int getMinimumDifference(TreeNode root);
}
