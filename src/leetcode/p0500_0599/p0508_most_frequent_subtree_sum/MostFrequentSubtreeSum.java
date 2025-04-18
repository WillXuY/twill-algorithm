package org.willxu.algorithm.service.ints;

import common.provide.TreeNode;

public interface MostFrequentSubtreeSum {
    /**
     * Given the root of a binary tree, return the most frequent subtree
     * sum. If there is a tie, return all the values with the highest
     * frequency in any order.
     * <p>
     * The subtree sum of a node is defined as the sum of all the node
     * values formed by the subtree rooted at that node (including the
     * node itself).
     *
     * @param root The number of nodes in the tree is in the range [1, 10^4].
     *             -10^5 <= Node.val <= 10^5
     */
    int[] findFrequentTreeSum(TreeNode root);
}
