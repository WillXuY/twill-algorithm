package leetcode.p0900_0999.p0993_cousins_in_binary_tree;

import common.provide.TreeNode;

public interface CousinsInBinaryTree {
    /**
     * Given the root of a binary tree with unique values and the values
     * of two different nodes of the tree x and y, return true if the
     * nodes corresponding to the values x and y in the tree are
     * cousins, or false otherwise.
     * Two nodes of a binary tree are cousins if they have the same
     * depth with different parents.
     * Note that in a binary tree, the root node is at the depth 0, and
     * children of each depth k node are at the depth k + 1.
     *
     * @param root 2 <= root.size <= 100
     *             1 <= Node.val <= 100
     *             Each node has a unique value.
     * @param x x != y
     *          x are exist in the tree.
     * @param y are exist in the tree.
     * @return is x and y cousins.
     */
    boolean isCousins(TreeNode root, int x, int y);
}
