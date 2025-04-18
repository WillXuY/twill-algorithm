package org.willxu.algorithm.service.bool;

import common.provide.TreeNode;

public interface LeafSimilarTrees {
    /**
     * Consider all the leaves of a binary tree, from left to right
     * order, the values of those leaves form a leaf value sequence.
     *     3
     *    / \
     *   5   1
     *  /\  /\
     * 6 2 9 8
     *  /\
     * 7 4
     * For example, in the given tree above, the leaf value sequence is
     * (6, 7, 4, 9, 8).
     * Two binary trees are considered leaf-similar if their leaf value
     * sequence is the same.
     * Return true if and only if the two given tree with head nodes
     * root1 and root2 are leaf-similar.
     *
     * @param root1 The number of nodes will be in the range [1, 200].
     *              will have values in the range [0, 200].
     * @param root2 The number of nodes will be in the range [1, 200].
     *              will have values in the range [0, 200].
     * @return root1's leaf is similar to root2's leaf.
     */
    boolean leafSimilar(TreeNode root1, TreeNode root2);
}
