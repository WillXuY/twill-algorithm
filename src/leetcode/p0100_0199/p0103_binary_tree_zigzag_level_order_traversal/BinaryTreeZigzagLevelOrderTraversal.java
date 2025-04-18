package org.willxu.algorithm.service.intlist;

import common.provide.TreeNode;

import java.util.List;

public interface BinaryTreeZigzagLevelOrderTraversal {
    /**
     * Given the root of a binary tree, return the zigzag level order
     * traversal of its nodes' values. (i.e., from left to right, then
     * right to left for the next level and alternate between).
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 2000].
     *             -100 <= Node.val <= 100
     */
    List<List<Integer>> zigzagLevelOrder(TreeNode root);
}
