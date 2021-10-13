package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface DiameterOfBinaryTree {
    /**
     * Given the root of a binary tree, return the length of the
     * diameter of the tree.
     * The diameter of a binary tree is the length of the longest path
     * between any two nodes in a tree. This path may or may not pass
     * through the root.
     * The length of a path between two nodes is represented by the
     * number of edges between them.
     *
     * @param root 1 <= root.size <= 10^4
     *             -100 <= node.val <= 100
     * @return diameter.
     */
    int diameterOfBinaryTree(TreeNode root);
}
