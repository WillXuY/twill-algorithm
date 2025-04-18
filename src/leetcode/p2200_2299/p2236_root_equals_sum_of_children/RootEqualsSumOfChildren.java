package leetcode.p2200_2299.p2236_root_equals_sum_of_children;

import common.provide.TreeNode;

public interface RootEqualsSumOfChildren {
    /**
     * You are given the root of a binary tree that consists of exactly
     * 3 nodes: the root, its left child, and its right child.
     * <p>
     * Return true if the value of the root is equal to the sum of the
     * values of its two children, or false otherwise.
     *
     * @param root The tree consists only of the root, its left child,
     *             and its right child.
     *             -100 <= Node.val <= 100
     */
    boolean checkTree(TreeNode root);
}
