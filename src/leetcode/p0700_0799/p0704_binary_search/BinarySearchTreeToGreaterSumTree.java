package leetcode.p0700_0799.p0704_binary_search;

import common.provide.TreeNode;

public interface BinarySearchTreeToGreaterSumTree {
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
     *             [1, 100].
     *             0 <= Node.val <= 100
     *             All the values in the tree are unique.
     */
    TreeNode bstToGst(TreeNode root);
}
