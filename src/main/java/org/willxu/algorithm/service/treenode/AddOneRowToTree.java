package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface AddOneRowToTree {
    /**
     * Given the root of a binary tree and two integers val and depth,
     * add a row of nodes with value val at the given depth depth.
     * <p>
     * Note that the root node is at depth 1.
     * <p>
     * The adding rule is:
     * <p>
     * - Given the integer depth, for each not null tree node cur at the
     *   depth depth - 1, create two tree nodes with value val as cur's
     *   left subtree root and right subtree root.
     * - cur's original left subtree should be the left subtree of the
     *   new left subtree root.
     * - cur's original right subtree should be the right subtree of the
     *   new right subtree root.
     * - If depth == 1 that means there is no depth depth - 1 at all,
     *   then create a tree node with value val as the new root of the
     *   whole original tree, and the original tree is the new root's
     *   left subtree.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             The depth of the tree is in the range [1, 10^4].
     *             -100 <= Node.val <= 100
     * @param val -10^5 <= val <= 10^5
     * @param depth 1 <= depth <= the depth of tree + 1
     */
    TreeNode addOneRow(TreeNode root, int val, int depth);
}
