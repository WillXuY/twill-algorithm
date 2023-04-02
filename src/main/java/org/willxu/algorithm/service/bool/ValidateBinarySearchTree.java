package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface ValidateBinarySearchTree {
    /**
     * Given the root of a binary tree, determine if it is a valid
     * binary search tree (BST).
     * <p>
     * A valid BST is defined as follows:
     * <p>
     * - The left subtree of a node contains only nodes with keys less
     *   than the node's key.
     * - The right subtree of a node contains only nodes with keys
     *   greater than the node's key.
     * - Both the left and right subtrees must also be binary search
     *   trees.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 104].
     *             -231 <= Node.val <= 231 - 1
     */
    boolean isValidBST(TreeNode root);
}
