package leetcode.p0600_0699.p0669_trim_binary_search_tree;

import common.provide.TreeNode;

public interface TrimBinarySearchTree {
    /**
     * Given the root of a binary search tree and the lowest and highest
     * boundaries as low and high, trim the tree so that all its
     * elements lies in [low, high]. Trimming the tree should not change
     * the relative structure of the elements that will remain in the
     * tree (i.e., any node's descendant should remain a descendant). It
     * can be proven that there is a unique answer.
     * <p>
     * Return the root of the trimmed binary search tree. Note that the
     * root may change depending on the given bounds.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 10^4].
     *             0 <= Node.val <= 10^4
     *             The value of each node in the tree is unique.
     *             root is guaranteed to be a valid binary search tree.
     * @param low,high 0 <= low <= high <= 10^4
     */
    TreeNode trimBST(TreeNode root, int low, int high);
}
