package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface ConvertBstToGreaterTree {
    /**
     * Given the root of a Binary Search Tree (BST), convert it to a
     * Greater Tree such that every key of the original BST is changed
     * to the original key plus the sum of all keys greater than the
     * original key in BST.
     * <p>
     * As a reminder, a binary search tree is a tree that satisfies
     * these constraints:
     * <p>
     * - The left subtree of a node contains only nodes with keys less
     *   than the node's key.
     * - The right subtree of a node contains only nodes with keys
     *   greater than the node's key.
     * - Both the left and right subtrees must also be binary search
     *   trees.
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 10^4].
     *             -10^4 <= Node.val <= 10^4
     *             All the values in the tree are unique.
     *             root is guaranteed to be a valid binary search tree.
     */
    TreeNode convertBST(TreeNode root);
}
