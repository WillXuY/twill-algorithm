package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface LongestZigzagPathInBinaryTree {
    /**
     * You are given the root of a binary tree.
     * <p>
     * A ZigZag path for a binary tree is defined as follow:
     * <p>
     * - Choose any node in the binary tree and a direction (right or
     *   left).
     * - If the current direction is right, move to the right child of
     *   the current node; otherwise, move to the left child.
     * - Change the direction from right to left or from left to right.
     * - Repeat the second and third steps until you can't move in the
     *   tree.
     * <p>
     * Zigzag length is defined as the number of nodes visited - 1. (A
     * single node has a length of 0).
     * <p>
     * Return the longest ZigZag path contained in that tree.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 5 * 10^4].
     *             1 <= Node.val <= 100
     */
    int longestZigZag(TreeNode root);
}
