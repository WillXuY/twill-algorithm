package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface KthSmallestElementInBst {
    /**
     * Given the root of a binary search tree, and an integer k, return
     * the k^th smallest value (1-indexed) of all the values of the
     * nodes in the tree.
     *
     * @param root The number of nodes in the tree is n.
     *             0 <= Node.val <= 10^4
     * @param k 1 <= k <= n <= 10^4
     */
    int kthSmallest(TreeNode root, int k);
}
