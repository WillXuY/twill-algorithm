package org.willxu.algorithm.service.ints;

import common.provide.TreeNode;

public interface FindModeInBinarySearchTree {
    /**
     * Given the root of a binary search tree (BST) with duplicates,
     * return all the mode(s) (i.e., the most frequently occurred
     * element) in it.
     * If the tree has more than one mode, return them in any order.
     * Assume a BST is defined as follows:
     * - The left subtree of a node contains only nodes with keys less
     *   than or equal to the node's key.
     * - The right subtree of a node contains only nodes with keys
     *   greater than or equal to the node's key.
     * - Both the left and right subtrees must also be binary search
     *   trees.
     *
     * @param root 1 <= root.size <= 10^4
     *             -10^5 <= Node.val <= 10^5
     * @return the most frequently occurred element(s).
     */
    int[] findMode(TreeNode root);
}
