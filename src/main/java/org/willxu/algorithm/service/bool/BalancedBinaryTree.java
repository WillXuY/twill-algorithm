package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface BalancedBinaryTree {
    /**
     * Given a binary tree, determine if it is height-balanced.
     *
     * For this problem, a height-balanced binary tree is defined as:
     *   a binary tree in which the left and right subtrees of every
     *   node differ in height by no more than 1.
     *
     * @param root 0 <= root.size <= 5000
     *             - 10^4 <= Node.val <= 10^4
     * @return balanced or not
     */
    boolean isBalanced(TreeNode root);
}
